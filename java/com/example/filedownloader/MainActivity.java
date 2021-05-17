package com.example.filedownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    long queue_id ;
    DownloadManager dm ;
    Button download_button;
    EditText uri_Etext;
    TextView tv, queue_id_tv;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        download_button = (Button) findViewById(R.id.button);
        uri_Etext = (EditText) findViewById(R.id.editText);
        tv = (TextView) findViewById(R.id.textView);
        queue_id_tv = (TextView) findViewById(R.id.queue_id_tv);
        sp = getApplicationContext().getSharedPreferences("MyDownloadQueue", Context.MODE_PRIVATE);
        String default_q_id = sp.getString("last_queue_id", "None");
        if(!default_q_id.equals("None")){
            queue_id = sp.getLong("last_queue_id_long", 0L);
        }

        queue_id_tv.setText(default_q_id);


        download_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Download(uri_Etext.getText().toString(), sp);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,
                            "Please enter a valid URI.",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        BroadcastReceiver receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if(DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(action)){
                    download_button.setEnabled(true);
                    DownloadManager.Query req_qurey = new DownloadManager.Query();
                    req_qurey.setFilterById(queue_id);
                    Cursor c = dm.query(req_qurey);
                    if(c.moveToFirst()){
                        int cIndex = c.getColumnIndex(DownloadManager.COLUMN_STATUS);
                        if(DownloadManager.STATUS_SUCCESSFUL == c.getInt(cIndex)){
                            tv.setText("Download Successful");
                            Toast.makeText(MainActivity.this,
                                    "Download Successful",
                                    Toast.LENGTH_LONG).show();
                        }
                        else{
                            tv.setText("Download Failed");
                            Toast.makeText(MainActivity.this,
                                    "Download Failed",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
        };

        registerReceiver(receiver, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));

    }

    public void Download(String uri, SharedPreferences sp){
        dm = (DownloadManager)getSystemService(DOWNLOAD_SERVICE);


        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(uri));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "testFile");
        queue_id = dm.enqueue(request);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("last_queue_id", Long.toString(queue_id));
        editor.putLong("last_queue_id_long", queue_id);
        editor.apply();
        queue_id_tv.setText(Long.toString(queue_id));
        tv.setText("Downloading...");
        checkStatus(queue_id);
        download_button.setEnabled(false);
    }

    public void checkStatus(long queue_id_in){
        Intent i = new Intent();
        i.setAction(DownloadManager.ACTION_VIEW_DOWNLOADS);
        startActivity(i);

    }
}

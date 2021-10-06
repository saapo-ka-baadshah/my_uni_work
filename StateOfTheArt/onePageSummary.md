# Ethereum as Viable IoT Development Stack : State of The Art

Currently we are living in a cryptocurrency bubble and as the technology have been advancing we are constantly moving through a paradigm shift.
Paradigm shift from **Proof of Work** to **Proof of Stake**. Ethereum networks are trying to adapt the existing policies to the new state of the art **Proof of Stake** policies. New cryptocurrencies like **Cardano** and **Solano** are suggesting the advancements of such movements.

Keeping this in mind, the more and more decentralized computational approaches can be seen in the near future. Hence the ubiquity of the IoT devices can seem to be the very interest of the DApps developers.

---

## Abstract

For this, 3 major publications have been studied, which connect these two dots. There have not been many publications regarding this topic since the Launch of ethereum Development Stack is relatively new.
Though there are many other papers related to IoT and Ethereum, the other publications majorly talk about the applications of ethereum in Authentication and threat analysis part of the Subject.
This research talks about the applications of Ethereum for IoT and the possiblity of usage in Data Handling as well as Architectural spectrum.

---

### **Kadam S.B., John S.K. (2020) Ethereum Based IoT Architecture.** _In: Smys S., Senjyu T., Lafata P. (eds) Second International Conference on Computer Networks and Communication Technologies. ICCNCT 2019. Lecture Notes on Data Engineering and Communications Technologies, vol 44. Springer, Cham. https://doi.org/10.1007/978-3-030-37051-0_20_

This publication posits a generalized architecture, where the sensor nodes have been bifurcated from the processing nodes. At the edge, the sensors are assumed to have a some pre-established communication channel in between the Sensor Node and a Gateway.
This gateway is equipped with a client application that connects the sensor matrix to a test network that works on the Ethereum Virtual Machine, which in fact is nothing but a network of working nodes which serve as a pool of miners.

The Gateway in this study is a Rasberry Pi. The simulation results are poorly documented missing the most cruicial details such as the EVM network, Processor, Processor counts serving as a miner, RPi model.

**GAP1 : This research can be done more specific towards a target set of devices under common set of conditions such as networks, gas limits. **

---

### Mehedi, S.K.T., Shamim, A.A.M. & Miah, M.B.A. Blockchain-based security management of IoT infrastructure with Ethereum transactions. Iran J Comput Sci 2, 189–195 (2019). https://doi.org/10.1007/s42044-019-00044-z

This study posits the architecture on the similar architecture but with a few more simulation details. Such as block size, gas limit etc, EVM networks.

This also proposes a table of results, stating the different transaction counts for the Sharable and Nonsharable networks. This publications explains the interpretations of major buzzwords in the Ethereum community well.

---

### Shehzad F., Javaid N., Farooq U., Tariq H., Ahmad I., Jabeen S. (2020) IoT Enabled E-Business via Blockchain Technology Using Ethereum Platform. In: Barolli L., Amato F., Moscato F., Enokido T., Takizawa M. (eds) Web, Artificial Intelligence and Network Applications. WAINA 2020. Advances in Intelligent Systems and Computing, vol 1150. Springer, Cham. https://doi.org/10.1007/978-3-030-44038-1_62

This study posits a different view on the decentralized architures for IoT. This emphasizes on the use of NFC as the sensor for the IoT edge.

The main aim of the study is to analyze the effects of Central Transactional Parties, such as Banks and Ledgers, on a network of IoT devices.

The study tries to simulate the effects of two different consensus protocols (i.e. **Proof of Work** and **Proof of Authority**) on the Transaction counts. Considering the transaction count as valid metric, the system proposes comparison between both and subtly conveys the message that the **Proof of Authority** creates more transactions than that of **Proof of Work**.

---

## The Institution Paradigm

**GAP: In my opinion, Proof of Work and Proof of Authority can not be compared considering the Transaction Count as a metric.**

We can not compare an employee who is slow but always correct, with an employee who is fast but correct only for 80% of the work.

But one as a controlling body of the Institution, can assign the slow employee the most security sensitive work. While the other employee a less sensitive but arduous work.

---

## Gap: Whisper Protocol as IoT Communication protocol

When searched for the keywords 'Whisper Protocol and IoT', no major publication appears to be a good interpretation of the communication spectrum of the situation.

-----> Talk about Whisper protocol here

One possible gap to fill up as a researcher is to study about the communication protocols for decentralized applications and combining it with traditional IoT communication protocols. (From the perspective of creating a package of **Slow and Most Secure** protocol and **Fast and Less Secure** protocol)

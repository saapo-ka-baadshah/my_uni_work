# Consensus Protocol : Proof of Authentication #

## Consensus Protocols in Blockchain ##
All the block generators (transaction services) in the blockchain are supposed to prove that the sources of the transactions are valid, and are necessary to provide a body of work/ action in order to provide the immutability to the block. 

e.g. **Bitcoin uses PoW (Proof of Work)** i.e. using a computaionally heavy mining equipment to increase the chances of solving a public cryptographic puzzle in order to get the coin as a mining reward. 

**PoS**(initial iteration by peercoin): encouraging investors to buy in some amount of currency which creates a stake for the investor. Larger the stake higher will be the probablity of validating a new transaction. If any fraudulant transaction is validated by the validator then the stakes are minimized, making the system select the fraudulant validator with a low probability. 

Both the consensus protocols have their own drawbacks, 
- *Proof of Work drawbacks*:
    1. From equipment point of view, the PoW is making the rich richer. i.e. one who possesses more capacity of buying a new set of mining equipment, will have the more chances of creating a new block and earning the mining reward. This is unfair since not every stakeholder will have equipment or resources to mine at such a potential.
    2. 51% attack: The mining process has to happen on a limited volume of cryptographic puzzles. This limited volume is called mining pool. If one entity (an investor, miner, community of miners, company), has enough equipment to exhaust more than equal to 51% of the total mining pool, then the probability of creating the next block by this entity is higher. This entity now can create fraudulant transactions
&nbsp;
- *Proof of Stake drawbacks*: 
    1. Based on holdings of a stakeholder, the higher the stakes one possesses the higher will be the possibility of getting selected as a validator
    
This problem in Proof of Stake is solved by follwing modifications:
- Proof of coinage
- Proof of Deposit
- Proof of Burn
- Proof of activity 


---
### Proof of Authentication ###

All above terms are created asserting **money** as a viable and transferable entity. But in reality, Money is not the only such body.

In this age of ubiquitous computing, every single activity is generating data. Which is being sold to the marketing bodies of big companies and is being sold in illegal markets. This is an indication that **User Data** is also such a viable and transferable entity. 

IoT Devices are one of the biggest sources of such Data generators. And hence the validity and trust of such data plays an important role in the IoT world. Hence the trustworthiness of such entities has to be proven in order to even create the transactions of data.

[Proof of Authentication (PoAh)](https://ieeexplore.ieee.org/stamp/stamp.jsp?tp=&arnumber=9221187) provides one such method of Authentication. 

The system that they propose is not a completely decentralized entity in itself, but provides a mechanism to introduce more and more data aggregation nodes (collecting data from the sensor nodes) while keeping the system trust intact. For this purpose the subjected research has provided method of keeping the trusted MAC address list. 


I believe that, the area of blockchains considering a distributed ledger system for the ledger of **data** (or any other loosely transferable entity)  is not well explored. 

The and the need to maintain such a system in an IoT system is very prominant. 

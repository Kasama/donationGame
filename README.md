#Donation Game

##Introduction

This is a simple implementation of a [donation game] (https://docs.google.com/document/d/15-psEzuaBd3JNpqLvNXAW3pozQSDfF-XBxzaYrQi9YU/edit) for a OOP class

##Download
```bash
cd /clone/folder
git clone https://github.com/Kasama/donationGame
```
after that you should have a folder called donationGame, containing the repository clone

##Compilation

you have two options for compiling

```bash
cd /clone/folder
chmod +x compile.sh
./compile.sh
```
the script has only one line containing the javac command, but its easier to run than to type the whole thing in

*OR*

```bash
cd /clone/folder/donationGame
javac -d donationGame/bin donationGame/src/br/usp/icmc/ssc01032015/*.java
```

##Running

you also have two options for running

```bash
cd /clone/folder
chmod +x run.sh
./run.sh <number of rounds> <number of players using strategy 1> [<number of players using strategy 2> [...]]
```

this script also has only one line containing the java command

*OR*

```bash
cd /clone/folder/donationGame
java -cp donationGame/bin/ br.usp.icmc.ssc01032015.Main <number of rounds> <number of players using strategy 1> [<number of players using strategy 2> [...]]
```




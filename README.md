# PokerHaus
A simple Commandline tool that evaluates the best poker hand possible
given 5 cards.
The program does not enforce a legal poker deck
It also does not accept wildcards or jokers
The ace is valued at 14 and not 1

## Building
The building of this project has been greatly simplified using the gradle build system.

### Prerequisites
* Java 8
* Gradle 4+
### Helpful Tools
* [Gradle Installation](https://gradle.org/install/) - instructions to install gradle
* [SDKMAN](http://sdkman.io/) - this is a useful tool that will install java + gradle for you


To Build and Run the system simply use:
```
gradle build
gradle run
gradle test
```
##Sample Usage
Either by using the generated jar file or gradle run interactions are as follows:

```
>>Enter Poker Hand:
Ad Ks QH Jh 10c
>>Straight
```
Program takes input as a value and a suite each card being space separated and expects exactly 5 cards.
Input for suite can be upper or lower case but face cards must be Upper case or their respective value
eg.
```
11c = Jc = JC = 11C
```


### Tests
JUnit Testing is run to evaluate logic and edge cases.
Test results can be found in 
```
build/reports/tests/test/index.html
```
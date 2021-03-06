:: This file starts all Nodes written in the file inputTextFile.txt and once the Initiator
@ECHO OFF

:: go to src directory
cd ../src

:: set Classpath for JSON jar
set CLASSPATH=.;D:\GitHubProjekte\VAA_WS2018_U1_A4\lib\org.json.jar

:: Removes all class files
rm *.class

:: Compiles java files
javac Node.java
javac Initiator.java

:: Reads every line of the file inputTextFile.txt
:: For every Node ID (written in each line) the java programm Node is started with the corresponding ID as parameter
for /f %%i in (D:\GitHubProjekte\VAA_WS2018_U1_A1\inputFiles\inputTextFile) do (
start cmd /K java Node %%i
)

:: Starts the java Initiator programm once
start cmd /K java Initiator
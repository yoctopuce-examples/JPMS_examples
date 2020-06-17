@echo OFF
javac -d classes -cp ..\YoctoLib.java.40924\Binaries\yoctoAPI.jar src\com\mycompany\app\App.java
java -cp ..\YoctoLib.java.40924\Binaries\yoctoAPI.jar;classes com.mycompany.app.App


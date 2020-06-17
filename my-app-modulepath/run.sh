#!/bin/sh
#javac -d classes -cp ../YoctoLib.java.40924/Binaries/yoctoAPI.jar src/com/mycompany/app/App.java 
#java -cp ../YoctoLib.java.40924/Binaries/yoctoAPI.jar:classes com.mycompany.app.App 

javac -d outDir --module-source-path Sources --module-path ../YoctoLib.java.40924/Binaries/yoctoAPI.jar Sources/main.app/com/mycompany/app/App.java
javac -d outDir --module-source-path Sources --module-path ../YoctoLib.java.40924/Binaries/yoctoAPI.jar Sources/hello.module/com/mycompany/module/Hello.java

java --module-path outDir:../YoctoLib.java.40924/Binaries/yoctoAPI.jar -m main.app/com.mycompany.app.App 



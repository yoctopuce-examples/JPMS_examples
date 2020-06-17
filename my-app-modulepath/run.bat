@echo OFF
javac -d outDir --module-source-path Sources --module-path ../YoctoLib.java.40924/Binaries/yoctoAPI.jar Sources/main.app/com/mycompany/app/App.java
javac -d outDir --module-source-path Sources --module-path ../YoctoLib.java.40924/Binaries/yoctoAPI.jar Sources/hello.module/com/mycompany/module/Hello.java
java --module-path outDir:../YoctoLib.java.40924/Binaries/yoctoAPI.jar -m main.app/com.mycompany.app.App



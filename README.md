# JPMS_examles

This is a very simple example of integration of theYoctopuce library for Java with Java >=9 modules (JPMS).

## my-app-modulepath

This example illustrate how to integrate the yoctoAPI.jar into a JPMS project.
Basically you need to add the ```yoctoAPI.jar`` file to the module path, and add
``requires yoctoAPI;`` to the module-info.java file of the module that use the Yoctopuce library.

## my-app-classpath

This example is the same code but without using JPMS. It's working as usual. you just need to add  ```yoctoAPI.jar`` file to the class path.

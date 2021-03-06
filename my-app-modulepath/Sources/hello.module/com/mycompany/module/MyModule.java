package com.mycompany.module;

import com.yoctopuce.YoctoAPI.*;

public class MyModule {

	public static void dumpAllDevices()
    {
		// print hello world
        System.out.println( "Use yoctoAPI.jar from modulepath." );

        // print Java version
        String version = System.getProperty("java.version");
        System.out.println("Java version :"+version);

        // print Yoctopuce API version
        System.out.println("Yoctopuce Java API :" + YAPI.GetAPIVersion());

        try {
            // setup the API to use local VirtualHub
            YAPI.RegisterHub("127.0.0.1");
            // list all Yoctopuce devices
            System.out.println("Device list");
            YModule module = YModule.FirstModule();
            while (module != null) {
                System.out.println(module.get_serialNumber() + " (" + module.get_productName() + ")");
                module = module.nextModule();
            }
        } catch (YAPI_Exception ex) {
            System.out.println("YAPI Error:" + ex.getLocalizedMessage());
        }
        // free all resources
        YAPI.FreeAPI();
    }

}
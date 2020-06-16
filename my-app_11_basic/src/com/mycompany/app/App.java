package com.mycompany.app;


import com.yoctopuce.YoctoAPI.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        System.out.println( "Hello World!" );
        String version = System.getProperty("java.version");
        System.out.println("Java:"+version);
        String msg = YAPI.GetAPIVersion();
        System.out.println("Yoctopuce lib :"+msg);
        try {
        	YAPI.RegisterHub("172.17.17.142");
        }catch(YAPI_Exception ex) {
        	System.out.println(ex.getLocalizedMessage());
        }
        YAPI.FreeAPI();
    }
}

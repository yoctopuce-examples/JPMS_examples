package com.mycompany.module;

public class Hello {
	public static void printHello()
	{
		// print hello world
        System.out.println( "Hello World!" );
        // print Java version
        String version = System.getProperty("java.version");
        System.out.println("Java version :"+version);
	}
}
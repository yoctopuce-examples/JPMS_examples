module hello.module{
	exports com.mycompany.module;
	// Since yoctopuce yoctoAPI.jar file does not use JPMS
	// we just need to use the filename (ie yoctoAPI)
	requires yoctoAPI;

}
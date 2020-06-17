module main.app {
	requires hello.module;
	// Since yoctopuce yoctoAPI.jar file does not use JPMS
	// we just need to use the filename (ie yoctoAPI)
	requires yoctoAPI;

}
package com.tcs.creational;

public class RBI {
	public static RBI instance;
	
	private RBI() {

}
	
	public static RBI getInstance() {
		if(instance == null) {
			instance = new RBI();
		}
		return instance;
	}
}

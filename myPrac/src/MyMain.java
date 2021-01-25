package com.test.com;

public class MyMain extends AdapterClass{

	public static void main(String[] args) {
		Benz benz = new Benz();
		benz.getModelNumber();
		benz.getWheels();
		
		MyMain myM = new MyMain();
		System.out.println(myM.getWheels());
		
	}
	
	public int getWheels() {
		return 5;
	}
}

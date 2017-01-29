package com.arun.springidol;

public class SingerofTypeByTpe implements Singer{

	public void sings() {
		System.out.println("Singer of type Singer but Autowire has been set as false...");
	}

}

package com.verify;

import java.util.ArrayList;
import java.util.List;

public class Verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the world Chethan");
		System.out.println("Slave adding");
		System.out.println("Master changed");
		int i=10;
		System.out.println(String.format("value"+" is %d",i));
		List<String> errorList = new ArrayList<String>();
		 new Check().error(errorList);
		System.out.println(errorList.isEmpty());
	}

}

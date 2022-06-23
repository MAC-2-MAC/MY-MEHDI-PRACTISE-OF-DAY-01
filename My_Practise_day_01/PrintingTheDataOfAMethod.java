package com.My_Practise_day_01;

public class PrintingTheDataOfAMethod { //driver class
	
	void copyMe() { //method here it is not default constructor because it is having the diff method name
		// in default construtor the method name will be same as the given class name
		System.out.println("This method is going to be print in the output by creating object in main method");//desired output
	}

	public static void main(String[] args) { //main method
		PrintingTheDataOfAMethod object = new PrintingTheDataOfAMethod();//creating object
	    object.copyMe();//calling method from the object created

	}

}

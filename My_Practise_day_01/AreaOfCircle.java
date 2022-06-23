package com.My_Practise_day_01;

public class AreaOfCircle {
	final float pi = 22/7; //when the variable is declared with final access modifier then we cant change the value of pi anywhere in the program it remain stable and if we try to change the value of pi it throughs an error.
	float radius,result; //data variables

	public static void main(String[] args) { //main method
		AreaOfCircle object = new AreaOfCircle(); //new object created
		
		object.radius = 15.2f; //assign radius value by object.radius
		object.result = object.pi*object.radius*object.radius; //logic for result
		
		System.out.println("The area of the circle is: "+object.result+"cms");//desired output
		
		

	}

}

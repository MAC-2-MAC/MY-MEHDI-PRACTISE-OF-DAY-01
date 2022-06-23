package com.My_Practise_day_01;

class Sumit{
	
    public String name = "Sumit"; //public access modifier can used any where inside or outside the project
	protected int age = 23; // protected acccess modifier is used in the same class and same package same package non sub class and different package also but it is not work in different package non sub class
	private float height = 5.7f; // private access modifier is used in the same class where it is declared
	private boolean student = true; // same private
	protected char section = 'A';// same protected
          double percentage = 77.7;  //default mode can be accessed with the same class , same package sub class and same package non sub class
	
	
}

public class DeclaringDifferentAccessModifiers {
	
	
	public static void main(String[] args) {
		
		Sumit object = new Sumit();
		
		System.out.println("My name is :"+object.name);
		System.out.println("I am "+object.age+"years old");
		//System.out.println("my height is "+object.height+"feet"); // here values wont get printed as we declare private access modifier here which means it only accessable in the same class
		//System.out.println("i am graduation student "+object.student);// same declared private
		System.out.println("i belong to secion "+ object.section);
		System.out.println("with agreegrate percantage "+object.percentage);
		
	
		//here you can check by removing the single comments whether it may print or not
		
		System.out.println("\n"
				+ "we successfully completed 3rd program of using different access modifiers");
	
     
	
		


	}

}

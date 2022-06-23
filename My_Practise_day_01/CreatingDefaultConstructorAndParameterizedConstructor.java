package com.My_Practise_day_01;

public class CreatingDefaultConstructorAndParameterizedConstructor {
	//String name = "sumit";
	//int age = 25;
  // we cannot assign the values here for the parameterized constructor
	
	
	public void creatingDefaultConstructorAndParameterizedConstructor() {
		
		System.out.println("This is  a default constructor");
		
	}
	
	void creatingDefaultConstructorAndParameterizedConstructor(String name, int age) {
		
		System.out.println("this is "+name+"\n i am "+age+"years old.");
	}

	public static void main(String[] args) {
		
		CreatingDefaultConstructorAndParameterizedConstructor object = new CreatingDefaultConstructorAndParameterizedConstructor();
		

		object.creatingDefaultConstructorAndParameterizedConstructor(); // here we are getting output without the System.out.println(); just because we have written that in default and parameterized constructors
		
		object.creatingDefaultConstructorAndParameterizedConstructor("sumit",25); // here were just calling those methods with the help of object created in main class
	
		//we have to assign the values here for the parameterized comstructor to get the desired output.
		
		// in the parameterized constructor we assign th values of string and int which are printed in the output
		
		System.out.println("\n"
				+ "we completed our 4th program of printing output from default and parameterized constructors on day 01");
	}
	
	

}

package com.My_Practise_day_01;

public class ExampleProgramForDefaultAndParameterizedConstructor {
	int id;
	String name;
	int age;
	float height;
	
	void exampleProgramForDefaultAndParameterizedConstructor() {  //if we didnt give any value then it will print null for String and 0 for int
		System.out.println("my name is "+name+"and my id is "+id); //default constructor is created automatically by the computer if we didnt declare it also
		
	}
	void exampleProgramForDefaultAndParameterizedConstructor(String name, int age, float height) {
		System.out.println("my name is "+name+"i am "+age+"years old.\n my height is "+height);
		
		System.out.println("if i calculate my age into double "+age*age);
		
		System.out.println("if i want to increase my by 3 times then "+height*3);
		
		System.out.println("if i want to add initial to my name:\n"+name+" Ameen Chittiwala");
	
	}

	public static void main(String[] args) {
		ExampleProgramForDefaultAndParameterizedConstructor object = new ExampleProgramForDefaultAndParameterizedConstructor();
		
		System.out.println(object.id);
		System.out.println(object.name);
		
	    object.exampleProgramForDefaultAndParameterizedConstructor();
	    object.exampleProgramForDefaultAndParameterizedConstructor("Mehdi",25,5.7f); 
	    
	    System.out.println("\n"
	    		+ "we have successfully completed our 6th program of assiging values at main method of a parameterized constructor of the day 01");
		
	}

}

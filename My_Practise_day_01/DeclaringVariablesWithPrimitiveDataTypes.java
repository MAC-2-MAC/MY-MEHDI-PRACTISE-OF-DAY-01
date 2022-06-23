package com.My_Practise_day_01;

public class DeclaringVariablesWithPrimitiveDataTypes {// driver class
    
	String name; //declaring variable
	
	int age;  //declaring variable
	
	float height;  //declaring variable
	
	boolean student;  //declaring variable
	
	char section;  //declaring variable
	
	public static void main(String[] args) {
	
	
	String name = "Sumit"; //here datatype String first letter s should must be capital, variables name should all be in lowercase and we have to declare the value with in the double quotes and end up with the semi column
	
	int age = 25; // here datatype int must be in the lower case every time when you declare and after assinging value it should end up with the Semi-column;
    
	float height = 5.6f; // here float datatype is used to declare the decimal values and while declaring the float we have to add lowercase  f  after the value and end up with the semi column
    
	boolean student = true; // here boolean datatype is used to declare the either true or false values of a variable it should end up with the semi column
    
	char section = 'A'; // here char datatype is used to declare a single value it will also end up with a semi column;
	
   double percentage = 77.7; // here double data type is used to declare the high decimal values and it will also end up with the semi column;
    
		System.out.println(" My name is "+name+"\n I am "+age+" years old.\n My height is "+height+""
				+ "\n I am graduation student"+student+"\n With an agreegrate of:"+percentage+"\n belongs to section: "+section);
 
		/*here to print System.out.println(); is used we have to enter the data with in the brackets
		 * " " are used to insert the string value to print output + operator is used to add both the string and the variable value it will also end up with the semi column */
  
       System.out.println("\n"
       		+ "we completed our 2nd program declaring variables with primitive datatypes on  day 01");  
       
       
       //here /n is used to give a line space between the two Continuous lines
   

	}

}

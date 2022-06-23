package com.My_Practise_day_01;

public class MethodOverRiding {// driver class

	void Sumit() {//method 1 with same name
		System.out.println("I Started practising with sumit from today (23-06-2022)");//desired output of method1
	}
	void Sumit(boolean status, int count) {//method 2 with same name
		System.out.println("\n Does he accept to do practise with you: "+status+" \n how many months have to practise like this:"+count);//desired output of method2
	}
	void Sumit(String name,int count) {//method 3 with same name
		System.out.println("\n who asked sumit to practise: "+name+"\n how many problems does he wants to practise daily:"+count);//desired output of method3
	}
	
	public static void main(String[] args) {//main method
		
	MethodOverRiding object = new MethodOverRiding();//object creating
	object.Sumit();//calling method1 with no parameters
	object.Sumit(true, 5);//calling method2 with parameters
	object.Sumit("MEHDI",10);//calling method3 with parameters
	
	/*here if we try to print output using only one calling option for example if we call
	 object.Sumit(); only then it will override the two methods with same name Sumit(boolean,int); and Sumit(String,int)  */
		
	

	}

}

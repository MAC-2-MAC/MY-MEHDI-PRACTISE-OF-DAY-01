package com.My_Practise_day_01;

public class StaticAndFinalDemo {
	
	int var1 = 10;
	static int var2 = 10;
	
	public void method1() {
		var1++;
		System.out.println(var1);
	}
	public void method2() {
		var2++;
		System.out.println(var2);
	}

	public static void main(String[] args) {
		StaticAndFinalDemo object = new StaticAndFinalDemo();
		StaticAndFinalDemo object1 = new StaticAndFinalDemo();
		StaticAndFinalDemo object2 = new StaticAndFinalDemo();
		
		System.out.println("using the non-static access modifier");
		object.method1();
		object1.method1();
		object2.method2();
		System.out.println("using the static access modifier");
		object.method2();
		object1.method2();
		object2.method2();
		
	}

}

package com.jbk;

public class A {
	int a=10;
	static int b=10;
	final int c=3;   
	
	public static void main(String[] args) {
		
		
		A aa=new A();
		aa.a++;
		aa.b++;
		System.out.println(aa.a);
		System.out.println(aa.b);
		A aa1=new A();
		aa1.a++;
		aa1.b++;
		System.out.println(aa1.a);
		System.out.println(aa1.b);
		System.out.println(aa.a);
		System.out.println(aa.b);
		System.out.println(aa1.a);
		System.out.println(aa1.b);
		
		
	}

}

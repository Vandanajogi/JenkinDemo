package com.jbk;

public class AA {

	static class B{
		void m1() {
			System.out.println("Iam in inner class");
		}
		static class C{
			void m2() {
				System.out.println("I am in m2");
			}
		}
	}
	static class D{
		void m3() {
			System.out.println("I am in m3");
		}
	}
	
	public static void main(String[] args) {
		AA.B.C aa=new AA.B.C();
		aa.m2();
		AA.B aa1=new AA.B();
		aa1.m1();
	AA.D aa3=new AA.D();
		aa3.m3();
	
	
}
}
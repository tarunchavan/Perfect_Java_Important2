package com.oops;

//---------- Durga sir --------
// Overloading Scenarios:

// case 1:
public class Overloading_Scenarios {

	public void m1() {
		System.out.println("no-arg method");
	}

	public void m1(int i) {
		System.out.println("int -arg method");
	}

	public void m1(double d) {
		System.out.println("double -arg method");
	}

	public static void main(String[] args) {

		Overloading_Scenarios t = new Overloading_Scenarios();
		t.m1();
		t.m1(10);
		t.m1(10.5);

	}

}

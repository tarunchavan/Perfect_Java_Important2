package J_Practice;

class P {
	public static void m1() {
		System.out.println("parent");
	}
}

class C extends P {
	public static void m1() {
		System.out.println("child");
	}
}

public class Overriding_scenario {
	public static void main(String[] args) {
		P p1 = new C();
		p1.m1();

	}
}

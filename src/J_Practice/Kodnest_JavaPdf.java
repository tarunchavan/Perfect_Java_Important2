package J_Practice;

import java.util.Arrays;

// Declaration and initialization:

//		int numDimes = 4; 
//		double length = 52.3 ;
//		char courseSection='J' ;
//		boolean done=true ;
//		String lastname="Reid-Miller" ;
//		int count=3+2 ;

// Arithmetic operators: 

//		addition  
//		subtraction
//		multiplication
//		division  (quotient)
//		modulo (remainder)

// print element of array :

// public class Kodnest_JavaPdf {
//
//	public static void main(String[] args) {
//
//		// how to print element of array :
//		int schoolmarks[] = { 25, 35, 55, 10, 5 };
//
//		System.out.println(Arrays.toString(schoolmarks));
//	}
//
//}

// How to Sort an Array ?  -- Arrays.sort() method

//public class Kodnest_JavaPdf {
//
//	public static void main(String[] args) {
//
//     int [] M= {12,5,7,9};
//     Arrays.sort(M);
//     System.out.println(Arrays.toString(M));
//	
//	}
//}

// how to iterate an array in java
//public class Kodnest_JavaPdf {
//
//	public static void main(String[] args) {
//
//		int[] a1 = new int[] { 46, 12, 78, 34, 89, 26 };
////		for (int i = 0; i < a1.length; i++) {
////			System.out.print(a1[i]+" ");
////		}   
//		// OR
//		for(int i:a1) {
//			System.out.println(i);
//		}
//	}
//}

// How to convert string to Integer in java:
//-- there are 2 methods in below :

//public class Kodnest_JavaPdf {
//
//	public static void main(String[] args) {
// method 1
//       String s="2015";
//       
//       int i=Integer.parseInt(s);
//       System.out.println(i);

//Method 2:
//		String s="2015";
//		int i=Integer.valueOf(s);
//		System.out.println(i);
//	}
//}

// How to convert Integer to String in java? 
//
//public class Kodnest_JavaPdf {
//
//	public static void main(String[] args) {
//
//		// Method 1:
////		int i = 2015;
////		String s = Integer.toString(i);
////		System.out.println(s);
//
//		// Method 2:
//		int i = 2015;
//		String s = String.valueOf(i);
//		System.out.println(s);
//
//	}
//}

// Give an example of how to achieve encapsulation in java :

/*
public class Kodnest_JavaPdf {

	private String name;
	private String idNum;
	private int age;

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Kodnest_JavaPdf a = new Kodnest_JavaPdf();
		a.setAge(21);
		a.setIdNum("1");
		a.setName("Jay");
		System.out.println(a.getAge());
		System.out.println(a.getIdNum());
		System.out.println(a.getName());

	}

}

*/

// predict output 
//
//public class Kodnest_JavaPdf {
//	static int i = 1;
//
//	public static void main(String[] args) {
//		int i = 1;
//		for (Kodnest_JavaPdf.i = 1; Kodnest_JavaPdf.i < 10; Kodnest_JavaPdf.i++) {
//			i = i + 2;
//			System.out.print(i + " ");
//		}
//
//	}
//}

// o/p:-  3 5 7 9 11 13 15 17 19 

// Multiple inheritance allowed by Interface
interface Printable {
	void print();
}

interface Showable {
	void show();
}

public class Kodnest_JavaPdf implements Printable, Showable {
	@Override
	public void show() {
		System.out.println("Hello");
	}

	@Override
	public void print() {
		System.out.println("Welcome");

	}

	public static void main(String[] args) {
		Kodnest_JavaPdf obj = new Kodnest_JavaPdf();
		obj.print();
		obj.show();
	}

}
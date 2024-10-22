package J_Practice;

import java.util.Locale;

// Second Largest Number from array:: 
/*
public class Example_1 {

	public static int getSecondLargestNo(int[] a, int total) {
		int temp;

		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];

	}

	public static void main(String[] args) {

		int a[] = { 12, 3, 123, 33, 424 };
		System.out.println("Second Largest No: " + getSecondLargestNo(a, a.length));
	}

}
*/
// 
/* 
public class Example_1 {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
//Locale locale=new Locale("fr","fr");//for the specific locale   
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Country());
		System.out.println(locale.getISO3Language());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
	}
}
*/
// Typecasting :  durga sir 

// 1. Implicit typecasting : smaller to bigger datatypes
/*
public class Example_1 {
	public static void main(String[] args) {
		
		// compiler converts char to int automatically by Implicit typecasting.
		int x='a';
		System.out.println(x);
		
		// compiler converts int into double automatically by Implicit typecasting.
		double d=10;
		System.out.println(d); 
	}
}

//2. Explicit typecasting 

public class Example_1 {
	public static void main(String[] args) {

//        int x=130;
//        byte b=x;  // CE : Possible loss of precision found: int required byte
		int x = 130;
		byte b = (byte) x;
		System.out.println(b);
	}
}

*/



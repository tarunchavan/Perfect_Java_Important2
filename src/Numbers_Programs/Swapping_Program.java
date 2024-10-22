package Numbers_Programs;

//Swapping by using third variable
//public class Swapping_Program {
//
//	public static void main(String[] args) {
//		int a=10, b=20,c ;
//		
//		System.out.println("Before Swapping: "+a+" "+b);
//		c=a;
//		a=b;
//		b=c;
//		System.out.println("After Swapping: "+a+" "+b);
//
//	}
//
//}

// Swapping without using third variable 
public class Swapping_Program {

	public static void main(String[] args) {
		int a=10, b=20 ;
		System.out.println("Before Swapping:: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping:: "+a+" "+b);
		
		
	}

}

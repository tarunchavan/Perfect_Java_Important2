package Arrays_Programs;

import java.util.Scanner;

// 1.scenario : basic example of array :: 

//public class Practice_Array {
//	public static void main(String[] args) {
//       
//		int [] arr = new int[5] ;
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter mark for student 1");
//		arr[0] = sc.nextInt();
//		System.out.println("Enter mark for student 1");
//		arr[1] = sc.nextInt();
//		System.out.println("Enter mark for student 1");
//		arr[2] = sc.nextInt();
//		System.out.println("Enter mark for student 1");
//		arr[3] = sc.nextInt();
//		System.out.println("Enter mark for student 1");
//		arr[4] = sc.nextInt();
//		
//		System.out.println("Array contents are: ");
//		System.out.println(arr[0]+" ");
//		System.out.println(arr[1]+" ");
//		System.out.println(arr[2]+" ");
//		System.out.println(arr[3]+" ");
//		System.out.println(arr[4]);
//		
//		
//	}
//}

// 2. for avoid repeatation we used for loop:: 

//public class Practice_Array {
//	public static void main(String[] args) {
//
//		int[] arr = new int[5];
//
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Enter marks for student " + i);
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("Array contents are: ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
//
//	}
//}

//3.  2- Dimensional Array : 
//  Write a java program to Store the age of student present in the class

public class Practice_Array {
	public static void main(String[] args) {

		int[][] arr = new int[3][4];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter age for class " + i + " student " + j);
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Arrays contents are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");

			}
		}

	}
}

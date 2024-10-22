package J_Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Very perfect for Revise :: 

// 1. add two int numbers :
//
//public class JustNormalPractice {
//	public static void main(String[] args) {
//
//		int first = 10;
//		int second = 20;
//		int sum = first + second;
//		System.out.println("Sum of 2 numbers: " + sum);
//
//	}
//}

//2. Armstrong Number: 

/*
public class JustNormalPractice {
	public static void main(String[] args) {
		int n = 153, arm = 0;
		int c = n;

		while (n > 0) {
			int rem = n % 10;
			arm = (rem * rem * rem) + arm;
			n = n / 10;
		}
		if (arm == c) {
			System.out.println("It is armstrong number");
		} else {
			System.out.println("It is not armstrong number");
		}

	}
}
*/

//3. check positive & negative number : 
/*
public class JustNormalPractice {
	public static void main(String[] args) {

		double a = 3.7;

		if (a > 0.0) {
			System.out.println("Number is positive");
		} else if (a < 0.0) {
			System.out.println("Number is Negative");
		} else {
			System.out.println("Number is 0.0");
		}
	}
}
*/
//4.  Even or odd number:

/*
public class JustNormalPractice {
	public static void main(String[] args) {
		int a = 22;
		if (a % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}
}
*/

//5. Fibonacci Series: 
/*
public class JustNormalPractice {
	public static void main(String[] args) {
		int f = 0, f1 = 1, f2;

		System.out.println(f + " ");
		System.out.println(f1 + " ");

		for (int i = 1; i <= 6; i++) {
			f2 = f + f1;
			System.out.println(f2 + " ");
			f = f1;
			f1 = f2;
		}

	}
}
*/

//6. Largest Number among three :

/*
public class JustNormalPractice {
	public static void main(String[] args) {

		int a = 55, b = 56, c = 78;

		if (a > b && a > c) {
			System.out.println(a + " : is the largest number");

		} else if (b > a && b > c) {
			System.out.println(b + " : is the largest number");

		} else {
			System.out.println(c + " : is the largest number");

		}
	}
}
*/
//7. Swapping of two numbers :

/*
public class JustNormalPractice {
	public static void main(String[] args) {

		int a=10, b=20,c ;
		System.out.println("Before swapping: "+a+" "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping: "+a+" "+b);
	}
}
*/

//8. Reverse Number : 

/*
public class JustNormalPractice {
	public static void main(String[] args) {
		int n = 1234, reverse = 0;

		while (n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		System.out.println("Reversed Number: " + reverse);

	}
}
*/
//9. Sum of Natural Number: 
/*
public class JustNormalPractice {
	public static void main(String[] args) {

		int num = 50, sum = 0;

		for (int i = 0; i < num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
*/
//10. Ip address : 
/*
public class JustNormalPractice {
	public static void main(String[] args) throws UnknownHostException {
		System.out.println(InetAddress.getLocalHost());
	}
}
*/
//11. Multiplication table: 
/*
public class JustNormalPractice {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + i * n);
		}
		
	}
}
*/
//12. prime number or Not : 

/*
public class JustNormalPractice {
	public static void main(String[] args) {
		int num, temp;

		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		num = sc.nextInt();

		for (int i = 2; i < num / 2; i++) {
			temp = num % 2;

			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " : is a prime number");
		} else {
			System.out.println(num + " : is not a prime number");
		}
	}
}
*/

//13. Palindrome number : 
//
//public class JustNormalPractice {
//	public static void main(String[] args) {
//
//		int n = 454, rem, temp;
//		int reverse = 0;
//		temp = n;
//
//		while (n > 0) {
//			rem = n % 10;
//			reverse = reverse * 10 + rem;
//			n = n / 10;
//		}
//		if (temp == reverse) {
//			System.out.println("It is Palindrome Number");
//		} else {
//			System.out.println("It is not Palindrome Number");
//		}
//
//	}
//}

// 14. Factorial Program : 

/*
public class JustNormalPractice {

	public static void factorial() {
		int n = 5;
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of 6 is: " + fact);
	}

	public static void main(String[] args) {
		factorial();

	}
}

*/
//15. Random Number Example :

/*
public class JustNormalPractice {

	public static void main(String [] args) {
 
		System.out.println("1st Random Number: "+Math.random());
		System.out.println("2st Random Number: "+Math.random());
		System.out.println("3st Random Number: "+Math.random());
		System.out.println("4st Random Number: "+Math.random());
		 
	}
}
*/

//16. Java program to check if given number is leap year or not : 

/*
public class JustNormalPractice {

	public static void main(String[] args) {
		int year = 2014;

		if (year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} else if (year % 100 == 0) {
			System.out.println(year + " is not leap year");
		} else if (year % 4 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not leap year");
		}

	}
}
*/

//17. Java program to find duplicate Number element:: 

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(160);
		list.add(1);
		list.add(2);

		Object[] numbers = list.toArray();

		Map<Integer, Integer> hashmap = new HashMap<>();

		for (Object word : numbers) {
			if (hashmap.get(word) != null) {
				hashmap.put(word, hashmap.get(word) + 1);
			} else {
				hashmap.put(word, 1);
			}
		}
		System.out.println(hashmap);

	}
}
*/
// 19 Occurence of each numbers from list: 

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 6, 2, 3, 4, 7, 8, 92, 5, 4, 7 };

		Map<Integer, Integer> hashmap = new HashMap<>();

		for (int word : a) {
			if (hashmap.get(word) != null) {
				hashmap.put(word, hashmap.get(word) + 1);
			} else {
				hashmap.put(word, 1);
			}
		}
		System.out.println(hashmap);

	}

}
*/
// ------------------------------------------
// ARRAY PROGRAMS :: 
//1. Number of element present in array : 

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Number of element present in array: " + arr.length);

	}
}
*/

//2. Ascending order program array
/*
public class JustNormalPractice {

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 2, 8, 7, 1 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}

*/
// 3. Descending Order ::

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 2, 8, 7, 1 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}

*/
//4. To find duplicate element from array : 

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		int[] arr = new int[] { 51, 2, 3, 4, 28, 7, 8, 8, 3 };

		System.out.println("Duplicate elements in given array: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}
*/

//5. Odd & Even Number from array : 

/*
public class JustNormalPractice {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 6, 3, 2 };

		System.out.println("Odd Numbers: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}

		}
		System.out.println("Even Numbers: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
*/
//6. program to sort an array with sort() predefined method of array: 

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		int[] a = { 3, 5, 6, 8, 7, 9, 0, 4, 5 };

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
*/

// 7. Java program to reverse an array : 

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		// Original array :
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array in Reverse order: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}
}

*/
//8 Java program to print the elements of array present in even numbers 

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		// on even position
//		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
//		System.out.println("elements of array present on even number: ");
//		for (int i = 1; i < arr.length; i = i + 2) {
//			System.out.println(arr[i]);
//		}

		//9. on odd position :
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("on odd position: ");
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}

	}
}
*/

//10. Largest element present in array : 

// public class JustNormalPractice {
//
//	public static void main(String[] args) {
//
//		int []arr= new int[] {25,11,7,75,56};
//		
//		 int max = arr[0] ;
//		 
//		 for(int i=0;i<arr.length;i++) {
//			 if(arr[i]>max) {
//				 max=arr[i]; 
//			 }
//		 }
//		System.out.println("largest element present in given array is: "+max);
//		
// 11. Smallest element present on array :

//		int[] arr = new int[] { 25, 11, 7, 75, 56 };
//
//		int min = arr[0];
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		
//		System.out.println("Smallest element present in array is: " + min);
//
//	 }
// }

//12. Java program to find number of element present in array : 

/*
public class JustNormalPractice {

	public static void main(String[] args) {
     int [] arr=new int[] {1,2,3,4,5};
     
     System.out.println("Number of element present in array: "+arr.length);
	}
}
*/

//13. Java program to sum of array : 
/*
public class JustNormalPractice {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of all element of an array is: " + sum);

	}
}
*/
//14. Missing number from array :

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 6, 7, 8, 9, 10 };

		int sum = 10 * 11 / 2;

		int actualsum = 0;
		for (int i = 0; i < arr.length; i++) {
			actualsum = actualsum + arr[i];
		}
		System.out.println("Missing number is: " + (sum - actualsum));

	}
}

*/
//18. java code to find second largest number from an array: 

/*
public class JustNormalPractice {

	public static int getSecondLargestNo(int a[], int total) {
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

		System.out.println("Second largest No: " + getSecondLargestNo(a, a.length));
	}

}
*/
//Move all Negative numbers to beginning and positive to end with 
// constant extra space ;

/*
public class JustNormalPractice {

	public static void main(String[] args) {
		int arr[] = {-12,11,-13,-5,6,-7,5,-3,-6} ;
		int temp ;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i] ;
					arr[i]=arr[j] ;
					arr[j]=temp ;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
*/

// third highest number : 
/*
public class JustNormalPractice {

	public static int getThirdLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 3];
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 5, 6, 3, 2 };
		System.out.println("Third Largest: " + getThirdLargest(a, a.length));

	}

}
*/
// Java program to check if the two array are equal :

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		int a[] = { 30, 25, 40, 23 };
		int b[] = { 30, 25, 40, 28 };

		boolean result = Arrays.equals(a, b);

		if (result == true) {
			System.out.println("Two arrays are equal");
		} else {
			System.out.println("Two arrays are not equal");
		}
	}
}

*/
// Java program to find common elements from both arrays : 

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		int arr1[] = { 8, 15, 6, 21, 25, 20 };
		int arr2[] = { 3, 8, 9, 15, 6, 21 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
*/
// --------------------------------------------------------
// String Programs : 

//1. Java program to Reverse String : 
/*
public class JustNormalPractice {

	public static void main(String[] args) {

//		String actual = "Mom";
//		String reverse = " ";
//
//		for (int i = actual.length() - 1; i >= 0; i--) {
//			reverse = reverse + actual.charAt(i);
//		}
//		System.out.println("Actual String is: " + actual);
//		System.out.println("Reverse String is: " + reverse);

		// 2nd way:

//		String str = "hello";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			System.out.println(str.charAt(i));
//		}

		// 3rd way :

//		String str = "hello";
//		char[] arr = str.toCharArray();
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			System.out.println(arr[i] + " ");
//		}

		// 4th way:
//		String str = "hello";
//		StringBuffer sb = new StringBuffer(str);
//		System.out.println(sb.reverse());
		
	}
}
*/

//2. Java program to count words in a string : 

/*
public class JustNormalPractice {

	public static void main(String[] args) {
		int count = 1;
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();

		
		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) == ' ' && words.charAt(i) != ' ') {
				count++;
			}
		}
		
		System.out.println("The number of words in a string is: " + count);

	}
}
*/

//3. Java program to check char is  alphabet or not 

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		char c = 'H';
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'z')) {
			System.out.println(c + " is an alphabet");
		} else {
			System.out.println(c + " is not an alphabet");
		}

	}
}

*/

//6. Display alphabets in uppercase : 
//
//public class JustNormalPractice {
//
//	public static void main(String[] args) {
//
//		char c;
//		for (c = 'A'; c <= 'Z'; c++) {
//			System.out.print(c + " ");
//		}
//
//	}
//
//}

//7. Java program to reverse words 

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		String str = "Java Programming language";

		String str2 = " ";
		String words[] = str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			str2 = str2 + words[i]+" ";

		}
		System.out.println(str2 + " ");
	}
}
*/
// 8. to count the total number of character in string :
//
//public class JustNormalPractice {
//
//	public static void main(String[] args) {
//
//		String str = "Hello";
//		int count = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) != ' ') {
//				count++;
//			}
//		}
//		System.out.println("total number of character in string: " + count);
//
//	}
//}

// 9. Java program to find all duplicate character in a string :

/*
public class JustNormalPractice {

	public static void main(String[] args) {

		String str = "Apple";
		char[] a = str.toCharArray();

		System.out.println("duplicate character in string: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
*/
// Character Occurrence : 
/*
public class JustNormalPractice {

	public static void main(String[] args) {

		String str = "testinter";
		char[] a = str.toCharArray();

		Map<Character, Integer> hashmap = new HashMap<>();

		for (char c : a) {
			if (hashmap.get(c) != null) {
				hashmap.put(c, hashmap.get(c) + 1);
			} else {
				hashmap.put(c, 1);
			}
		}

	}
}
*/
// ----------------------------------------------

//1. print sum of All Numbers: 
/*
public class JustNormalPractice {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 5, 6);

		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
		System.out.println(sum.get());
		
	}
}
*/

//2. Print average of all Numbers: 
/*
public class JustNormalPractice {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 33, 44, 22, 12, 34, 0);

		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("average is: " + avg);

	}
}

*/
//3. Number square average : 
/*
public class JustNormalPractice {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 10, 20, 30, 15);

		double avg = list.stream().map(e -> e * e).filter(e -> e > 100).mapToInt(e -> e).average().getAsDouble();
        System.out.println("average is: "+avg);
        
	}
}
*/
//4. print even and odd numbers using streams : 

/*
public class JustNormalPractice {

	public static void main(String[] args) {
		// for even
//		List<Integer> list = Arrays.asList(11, 2, 3, 45, 67, 9, 90, 8, 7, 8, 2);
//
//		List<Integer> evenlist = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
//		System.out.println(evenlist);

		// for odd
		List<Integer> list = Arrays.asList(11, 2, 3, 45, 67, 9, 90, 8, 7, 8, 2);
		List<Integer> oddlist = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
		System.out.println(oddlist);
		

	}
}
*/
//5. Print number starts with prefix 2 using streams : 

/*
public class JustNormalPractice {

	public static void main(String[] args) {
     
		List<Integer> numbers = Arrays.asList(2,222,234,567,890,432,236,211,22) ;
		List<Integer> result = numbers.stream().filter(n -> String.valueOf(n).startsWith("2")).collect(Collectors.toList());
	    System.out.println(result);
	}
}
*/

//8. Sort Numbers (Asc/Desc) using streams : 

/*
public class JustNormalPractice {

	public static void main(String[] args) {
		// ascending order :

//		List<Integer> list = Arrays.asList(3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 3, 40);
//		List<Integer> asc = list.stream().sorted().collect(Collectors.toList());
//		System.out.println(asc);

		// descending order :

		List<Integer> list = Arrays.asList(3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 3, 40);
		List<Integer> desc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(desc);

	}
}
*/
//7. find max and min numbers using streams 

public class JustNormalPractice {

	public static void main(String[] args) {

		// min value:

//		Stream<Integer> s3 = Stream.of(1, 2, 3, 5, 6);
//		Optional<Integer> min = s3.min((a1, a2) -> a1.compareTo(a2));
//		System.out.println("min: " + min.get());

		Stream<Integer> s3 = Stream.of(1, 2, 3, 5, 6);
		Optional<Integer> max = s3.max((o1, o2) -> o1.compareTo(o2));
		System.out.println("max: " + max.get());
	}
}

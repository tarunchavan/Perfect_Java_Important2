package J_Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Maximum occurence character : 

/*
public class Practice_Codes {

	static char occurence(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 0;
		char ans = ' ';

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			if (count < map.get(ch)) {
				ans = ch;
				count = map.get(ch);
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Maximum occurence character is: " + occurence(str));
	}

}
*/
// 2. check Armstrong Number. logic 
/*
public class Practice_Codes {
	public static void main(String[] args) {

		int n = 153, arm = 0;
		int c = n;

		while (n > 0) {
			int rem = n % 10; //3   // 5
			arm = (rem * rem * rem) + arm;  //27  //125+27=152
			n = n / 10; // 15 // 1
		}
		if (arm == c) {
			System.out.println("It is armstrong");
		} else {
			System.out.println("It is not armstrong");
		}
	}

}

*/
//3. Check Even or Odd number: 
/*
public class Practice_Codes {
	public static void main(String[] args) {
		int a = 22;
		if (a % 2 == 0) {
			System.out.println("Even number");

		} else {
			System.out.println("Odd number");
		}
	}
}
*/

//4. Fibonacci Series

/*
public class Practice_Codes {
	public static void main(String[] args) {
		int f = 0, f1 = 1, f2;

		System.out.println(f + " ");
		System.out.println(f1 + " ");

		for (int i = 1; i <= 6; i++) {
			f2 = f + f1;
			System.out.print(f2 + " ");
			f = f1;
			f1 = f2;
		}
	}
}

*/

// Reverse Number 
/*
public class Practice_Codes {
	public static void main(String[] args) {
		int n = 1234, reverse = 0;

		while (n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		System.out.println("Reverse Number is: " + reverse);
	}
}
*/
// Sum of natural number 
/*
public class Practice_Codes {
	public static void main(String[] args) {

		int num = 6, sum = 0;

		for (int i = 0; i < num; i++) {
			sum = sum + i;
		}
		System.out.println("sum of natural number is: " + sum);

	}
}

*/
// Ip address :

/*
public class Practice_Codes {
	public static void main(String[] args) throws UnknownHostException {

		  System.out.println(InetAddress.getLocalHost());
	}
}
*/
//Multiplication table: 

/*
public class Practice_Codes {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number for print table ");
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + i * n);
		}

	}
}

*/
// prime numbers: divided by itself or 1 

/*
public class Practice_Codes {
	public static void main(String[] args) {

		int num, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		num = sc.nextInt();

		boolean isPrime = true;

		for (int i = 2; i < num / 2; i++) {
			temp = num % 2;

			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " is a prime number ");
		} else {
			System.out.println(num + " is not a prime number ");
		}
	}
}

*/

// check palindrome number 

/*
public class Practice_Codes {
	public static void main(String[] args) {

		int n = 454, r, temp;
		int sum = 0;

		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		System.out.println(sum);
		if (temp == sum) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not palindrome");
		}
	}
}
*/
// factorial program 
/*
public class Practice_Codes {
public static void main(String[] args) {
	 int num=5 ;
	 int fact=1;

	 for(int i=1;i<=num;i++) {
		 fact = fact * i ;
	 }
	 System.out.println("factorial  of num is: "+fact);
	  
   }
}
*/

//
// Random Number Example :

/*
public class Practice_Codes {
	public static void main(String[] args) {
         System.out.println("1st Random Number: "+Math.random());
         System.out.println("2st Random Number: "+Math.random());
         System.out.println("3st Random Number: "+Math.random());
         System.out.println("4st Random Number: "+Math.random());
         
	}
}
*/
// 

// Check Leap year or not
/*
public class Practice_Codes {
	public static void main(String[] args) {
		System.out.println("Enter an year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} else if (year % 100 == 0) {
			System.out.println(year + " is a not leap year");
		} else if (year % 4 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}
}
*/
// occurrence of each numbers from list :

/*
public class Practice_Codes {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 6, 2, 3, 4, 7, 8, 92, 5, 4, 7 };

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

// Negative number to beginning & positive to end 

/*
public class Practice_Codes {
	public static void main(String[] args) {

		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
*/

// factorial by recursion :

/*
public class Practice_Codes {
	public static void main(String[] args) {

		int num = 6;
		long n = factorial(num);
		System.out.println("factorial of " + num + "=" + n);
	}

	public static long factorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}

	}

}
*/
// ----------------------------------

//1. Arrays programs to find duplicate element from array : 

/*
public class Practice_Codes {
	public static void main(String[] args) {

		int[] arr = new int[] { 51, 2, 3, 4, 28, 7, 8, 8, 3 };

		System.out.println("duplicate elements in given array: ");

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
// Reverse an Array: 

/*
public class Practice_Codes {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("original array: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

		System.out.println("Arrays in reverse order: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}
	}
}
*/
//Java program  to find elements present on even number : 

/*
public class Practice_Codes {
	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("elements of given array present on even position: ");
		// for even position 
		
//		for (int i = 1; i < arr.length; i = i + 2) {
//			System.out.println(arr[i]);
//		}
		
		// for odd position 
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}
	}

}
*/
// Largest element present in array : 

/*
public class Practice_Codes {
	public static void main(String[] args) {

		int[] arr = new int[] { 25, 11, 7, 75, 56 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest element present in given array is: " + max);

	}
}

*/

//Smallest element present in array :

/*
public class Practice_Codes {
	public static void main(String[] args) {

		int[] arr = new int[] { 25, 11, 7, 75, 56 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("smallest element present in array: " + min);

	}
}
*/
// Number of element present in array:

/*
public class Practice_Codes {
	public static void main(String[] args) {
		int[] arr = new int[] { 25, 11, 7, 75, 56 };
		System.out.println("Number of element present in array: "+arr.length);
	}
}

*/
//----------------------------------
// String programs : 

// Reverse Program : 
//1st way :
//
//public class Practice_Codes {
//	public static void main(String[] args) {
//
//		String actual = "Mom";
//		String rev = " ";
//		for (int i = actual.length() - 1; i >= 0; i--) {
//			rev = rev + actual.charAt(i);
//		}
//		System.out.println(rev);
//
//	}
//}
// 2nd way :

//public class Practice_Codes {
//	public static void main(String[] args) {
//		String str = "hello";
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			System.out.println(str.charAt(i));
//		}
//	}
//}
//
//public class Practice_Codes {
//	public static void main(String[] args) {
//		String str = "hello";
//		char[] arr = str.toCharArray();
//
//		for (int i = str.length()-1; i >= 0; i--) {
//			System.out.println(arr[i]);
//
//		}
//	}
//}
//4th way :

/*
public class Practice_Codes {
	public static void main(String[] args) {

		String str = "hello";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

	}
}
*/

//2. Java program to count words in  a string
//public class Practice_Codes {
//	public static void main(String[] args) {
//
//		String str = "Java is a language";
//		int count = 1;
//		for (int i = 0; i < str.length(); i++) {
//
//			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
//				count++;
//			}
//		}
//		System.out.println("The number of words in a string : " + count);
//	}
//}
// 3. Java program to check alphabet or not 
//
//public class Practice_Codes {
//	public static void main(String[] args) {
//
//		char c = 'H';
//		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
//			System.out.println(c + " : is an alphabet");
//		} else {
//			System.out.println(c + " : is not an alphabet");
//		}
//
//	}
//}
//4. Display alphabets in uppercase 

/*
public class Practice_Codes {
	public static void main(String[] args) {

		char c;

		for ( c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");

		}
	}
}
*/

//5. Java program to reverse words
//
//public class Practice_Codes {
//	public static void main(String[] args) {
//		String str = "Java programming language";
//		String str2 = " ";
//		String words[] = str.split(" ");
//
//		for (int i = words.length - 1; i >= 0; i--) {
//			str2 = str2 + words[i] + " ";
//		}
//		System.out.println(str2 + " ");
//	}
//}

//6. To count Number of character in a string: 
//
//public class Practice_Codes {
//	public static void main(String[] args) {
//		String s = "The best";
//		int count = 1;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) != ' ') {
//				count++;
//			}
//		}
//		System.out.println("Total no. of character in a string is: " + count);
//	}
//}

//7. Java program to find all duplicate character in a string:
//    
//public class Practice_Codes {
//	public static void main(String[] args) {
//       
//		String str="Apple" ;
//		char[]a=str.toCharArray();
//		
//		 System.out.println("The string is: "+str);
//		 System.out.println("Duplicate Character in above string: ");
//	    	
//		 for(int i=0;i<str.length();i++) {
//			 for(int j=i+1;j<str.length();j++) {
//				 if(a[i] ==a[j]) {
//					 System.out.println(a[i]);
//				 }
//			 }
//		 }
//	}
//}
//8. Java program to count the numberof vowels and consonants in a give
// given string 
//
//
//public class Practice_Codes {
//	public static void main(String[] args) {
//		String str = "Hello World";
//		int vowels = 0, consonants = 0;
//		str = str.toLowerCase();
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//
//			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//				vowels++;
//			} else if (ch >= 'a' && ch <= 'z') {
//				consonants++;
//			}
//		}
//		System.out.println("vowels: " + vowels);
//		System.out.println("consonants: " + consonants);
//	}
//}

// character occurence of character 
//
//public class Practice_Codes {
//	public static void main(String[] args) {
//
//		String str = "testintee";
//
//		char[] a = str.toCharArray();
//
//		Map<Character, Integer> hashmap = new HashMap<>();
//
//		for (char c : a) {
//			if (hashmap.get(c) != null) {
//				hashmap.put(c, hashmap.get(c) + 1);
//			} else {
//				hashmap.put(c, 1);
//			}
//		}
//		System.out.println(hashmap);
//	}
//}

// Palindrome Number: 
/*
public class Practice_Codes {
	public static void main(String[] args) {

		String str = "jaya";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (str.equals(reverse)) {
			System.out.println("It is Palindrome..");
		} else {
			System.out.println("It is not  Palindrome..");
		}
	}
}
*/
// Anagram code :
//
//public class Practice_Codes {
//	public static void main(String[] args) {
//
//		String str1 = "Race";
//		String str2 = "Care";
//
//		str1 = str1.toLowerCase();
//		str2 = str2.toLowerCase();
//
//		if (str1.length() == str2.length()) {
//			char[] array1 = str1.toCharArray();
//			char[] array2 = str2.toCharArray();
//
//			Arrays.sort(array1);
//			Arrays.sort(array2);
//
//			if (Arrays.equals(array1, array2)) {
//				System.out.println("Both strings are anagram");
//			} else {
//				System.out.println("Both strings are not anagram");
//			}
//		}
//
//	}
//}

//largest string from array : 
public class Practice_Codes {
	public static void main(String[] args) {
		String[] strArray = { "Java", "Hibernate", "springboot", "microservices" };

		String longestString = Arrays.stream(strArray)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println(longestString);
	}
}

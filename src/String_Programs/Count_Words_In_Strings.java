package String_Programs;

import java.util.Scanner;

// Count Words in a String 
public class Count_Words_In_Strings {

	public static void main(String[] args) {
		// String str="My Name is Tarun";
		
		System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int count = 1;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
				count++;

		}
		System.out.println(count);

	}

}

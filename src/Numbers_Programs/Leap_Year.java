package Numbers_Programs;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
      

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:: ");
		int year = sc.nextInt();

		if (year % 4 == 0) {
			System.out.println(year + " :is leap year");
		} else if (year % 100 == 0) {
			System.out.println(year + " :is not a leap year");
		} else if (year % 400 == 0) {
			System.out.println(year + " :is leap year");
		} else {
			System.out.println(year + " :is not leap year");
		}

	}

}

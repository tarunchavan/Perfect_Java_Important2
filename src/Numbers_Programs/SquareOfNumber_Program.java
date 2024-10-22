package Numbers_Programs;

import java.util.Scanner;

public class SquareOfNumber_Program {

	public static void main(String[] args) {
		
		System.out.println("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		float num=sc.nextFloat();
		
		float square = num*num ;
		System.out.println("square of number is: "+square);
		
	}

}

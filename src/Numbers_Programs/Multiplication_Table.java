package Numbers_Programs;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number for print table: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n +" * "+ i + " = "+n*i);
		}
        
	}

}

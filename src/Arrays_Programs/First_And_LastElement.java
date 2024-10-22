package Arrays_Programs;

import java.util.Scanner;

public class First_And_LastElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size= sc.nextInt();
		
		int a[]=new int[size] ;
           
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the value at index: "+i);
			a[i]=sc.nextInt();
		}
		
		System.out.println("First value: "+a[0]);
		System.out.println("Last value: "+a[a.length-1]);
		
		
	}

}

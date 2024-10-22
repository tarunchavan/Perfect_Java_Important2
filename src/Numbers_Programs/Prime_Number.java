package Numbers_Programs;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		int num,temp=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		num = sc.nextInt();
		
		boolean isPrime=true ;
		for(int i=2;i<num/2;i++){
			{
			temp=num%2 ;
		    }
		if(temp==0) {
			isPrime=false;
			break;
		}
	}
    if(isPrime) {
    	System.out.println(num+" : is a prime number");
    }
    else {
    	System.out.println(num+" :is not a prime number");
    }
 
  }
	
}

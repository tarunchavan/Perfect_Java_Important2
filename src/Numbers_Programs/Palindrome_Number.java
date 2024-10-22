package Numbers_Programs;

public class Palindrome_Number {

	public static void main(String[] args) {
		int r,sum=0 ;
		int n=454; 
		int temp=n ;
		while(n!=0) {
		 r = n%10 ;
		 sum=(sum*10)+r ;
		 n=n/10 ;
		 
		}
		if(temp==sum) {
			System.out.println("It is palindrome Number");
		}
		else {
			System.out.println("It is not palindrome Number");
		}
      
	}

}

package Numbers_Programs;

public class Reverse_Number {

	public static void main(String[] args) {
		int n=1234,reverse=0; 

		while(n!=0) {
			int digit = n%10 ;
			reverse =  reverse * 10 + digit ;
			n=n/10 ;
			
		}
		System.out.println("Reverse Number is: "+reverse);
		
	}

}

package Numbers_Programs;

public class Armstrong_Number {

	public static void main(String[] args) {
		// 153 =1+125+27=153

		int n=153,arm=0 ;
		int c=n;
		
		while(n>0) {
	    	int rem = n%10;
			arm = (rem * rem * rem)+arm ;
			n = n/10 ;			
		}
		if(arm ==c) {
			System.out.println("It is armstrong");
		}else {
			System.out.println("It is not armstrong");
		}
	}
}

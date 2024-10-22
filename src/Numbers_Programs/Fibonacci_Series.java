package Numbers_Programs;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		int f=0,f1=1,f2 ;
		
		System.out.print(f+" ");
		System.out.print(f1+" ");
		
		for(int i=1;i<=5;i++) {
			f2=f+f1;
			System.out.print(f2+" ");
			f=f1 ;
			f1=f2;
		}
	}
}

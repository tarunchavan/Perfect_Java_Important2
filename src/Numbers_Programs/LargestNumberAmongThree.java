package Numbers_Programs;

public class LargestNumberAmongThree {

	public static void main(String[] args) {
		int a=55,b=56,c=78; 
		
		if(a>b && a>c) {
			System.out.println(a + " :is largest Number");
		}
		else if(b>a && b>c) {
			System.out.println(b + " :is largest Number");
		}
		else{
			System.out.println(c + " :is largest Number");
		}

	}

}

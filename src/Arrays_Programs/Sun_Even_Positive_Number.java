package Arrays_Programs;


public class Sun_Even_Positive_Number {

	public static void main(String[] args) {
		
		int a[]= {2,4,5,6,3,4,7,8,9,5} ;
		int sum=0 ;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i] ;
			}
			
		}
		System.out.println("sum of positive number: "+sum);
		
	}

}

package Arrays_Programs;

public class Smallest_Element {

	public static void main(String[] args) {
		
		int []a= {25,11,7,75,56};

		int min=a[0] ;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i] ;
			}
		}
		System.out.println("Smallest element present in given array is: "+min);
		
	}

}

package Arrays_Programs;

public class Largest_Elements {

	public static void main(String[] args) {
		
		int a[]= {25,11,7,75,56};
		
		int max=a[0] ;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Largest element present in given array: "+max);

	}

}

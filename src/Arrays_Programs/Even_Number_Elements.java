package Arrays_Programs;

public class Even_Number_Elements {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		System.out.println("Element of given array present on even number is: ");
		for(int i=1;i<a.length;i=i+2) {
			System.out.println(a[i]);
		}
	}

}

package Arrays_Programs;

/*
public class SecondLargestInArray {

	public static int getSecondLargestNo(int a[], int total) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; i < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		return a[total - 2];

	}

	public static void main(String[] args) {

		int a[] = { 12, 3, 123, 33, 424 };

		System.out.println("Second Largest No: " + getSecondLargestNo(a, a.length));

	}

}
*/
public class SecondLargestInArray {
  public static void main(String[] args) {
	  int[] arr = {1,2,2,3,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Found duplicate: "+arr[i]);
					
				}
			}
		}
			  
  }
}
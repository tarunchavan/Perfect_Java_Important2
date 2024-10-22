package Arrays_Programs;

public class Sum_OF_Array {

	public static void main(String[] args) {
		int [] arr=new int[] {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i] ;
		}
   
		System.out.println("Sum of all element of an array: "+sum);
	}

}

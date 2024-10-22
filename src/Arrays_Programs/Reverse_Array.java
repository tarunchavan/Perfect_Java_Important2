package Arrays_Programs;

public class Reverse_Array {

	public static void main(String[] args) {
		
		int []arr=new int[] {1,2,3,4,5};
		
		System.out.println("Original Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

		System.out.println("Reversed Array: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
	}

}

package Arrays_Programs;

public class Ascending_Order_Program {

	public static void main(String[] args) {
		int temp=0 ;
		int []arr=new int[] {5,2,8,7,1};
		// displaying
		System.out.println("Elements of Original array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
  
		// sort in ascending
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Elements in ascending order array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
			
	}

}

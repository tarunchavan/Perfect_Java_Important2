package Arrays_Programs;

public class Missing_Number_From_Array {

	public static void main(String[] args) {
	
		int [] arr=new int [] {1,2,3,4,6,7,8,9,10};
		
		int sum=(10*11)/2;
		
		int actualsum =  0 ;
		for(int i=0;i<arr.length;i++) {
			actualsum = actualsum + arr[i];
		}
		
		System.out.println("Missing number is: "+actualsum);

	}

}

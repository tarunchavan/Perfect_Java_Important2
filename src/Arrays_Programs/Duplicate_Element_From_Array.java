package Arrays_Programs;

public class Duplicate_Element_From_Array {

	public static void main(String[] args) {

      int[]arr=new int[] {51,2,3,4,28,7,8,8,3};
      
      System.out.println("Duplicate element in given array: ");
      for(int i=0;i<arr.length;i++) {
    	  for(int j=i+1;j<arr.length;j++) 
    	   if(arr[i]==arr[j]) {
    		   System.out.println(arr[i]);
    	   }
      }
	}
   
}

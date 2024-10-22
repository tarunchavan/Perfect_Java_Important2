package Arrays_Programs;

import java.util.Arrays;

public class Sort_Array {

	public static void main(String[] args) {
		int []a = {3,5,6,8,7,9,0,4,5};
		
		Arrays.sort(a);
		
		System.out.println("Element of array sorted in ascending order: ");
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]+" ");
        }
	}

}

package Numbers_Programs;

import java.util.Arrays;

//Move all negative numbers to beginning & positive to end 
// Input::  -12,11,-13,-5,6,-7,5,-3,-6
// Output:: -13, -12, -7, -6, -5, -3, 5, 6, 11
public class MoveNegativeInBeginning_InArrayCogn {

	public static void main(String[] args) {
		
		int arr[] = {-12,11,-13,-5,6,-7,5,-3,-6};
		int temp=0 ;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j] ;
				arr[j]=temp ;
				}
			}
		}
          System.out.println(Arrays.toString(arr));
	}

}

package Arrays_Programs;

import java.util.Scanner;

public class Descending_Order_Program {

	public static void main(String[] args) {
		System.out.println("Enter the number of Elements: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n] ;
		
		System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++) {
	      arr[i]=sc.nextInt();
        }
        int temp=0;
        
        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]<arr[j]) {
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
       
        System.out.println();
        System.out.println("Elements of array sorted in descending order: ");
        
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]+" ");
        }
        
	}

}

package String_Programs;

import java.util.ArrayList;
import java.util.List;

public class Reverse_String {

	public static void main(String[] args) {
		
//		String s="Moms" ;
//
//		for(int i=s.length()-1;i>=0;i--) {
//		    System.out.print(s.charAt(i)+" ");
//		}

// 2. way :: 
//		
//		String actual="Hello" ;
//		String reverse=" ";
//		
//		for(int i=actual.length()-1;i>=0;i--) {
//			reverse = reverse +  actual.charAt(i) ;
//		}
//		
//		System.out.println("Reverse String is: "+reverse);
		
		
// 3 way:: 
		
//		String str="hello";
//		
//		char[]arr=str.toCharArray();
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.println(arr[i]+" ");
//		 }
				
		
		//4 way:: 
		
		String str="hello" ;
		StringBuffer a=new StringBuffer(str);;
		System.out.println(a.reverse());
		
	   }
	
}

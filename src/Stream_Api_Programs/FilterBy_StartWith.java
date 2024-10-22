package Stream_Api_Programs;

import java.util.stream.Stream;

//start with 's' alphabet 

public class FilterBy_StartWith {

	public static void main(String[] args) {
		
		String [] myArray= new String[] {"stream","is","a","sequence","of","elements","like","list"};
		
		Stream.of(myArray).filter(x -> x.startsWith("s")).forEach(System.out::println);
	
		
	}
}





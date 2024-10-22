package Stream_Api_Programs;

import java.util.stream.Stream;

public class StartWith {

	public static void main(String[] args) {
	Stream<String> myStream	 = Stream.of("like","and","share","https://www.geeksforgeeks.org/");
	myStream.filter(x -> x.startsWith("https")).forEach(System.out::println) ;
	
	
	}

}

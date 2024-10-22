package Stream_Api_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class List_Descending {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(15);
		list.add(250);
		list.add(52);
		
	Stream<Integer> sorted = list.stream().filter(i -> i>20).sorted((i1,i2) -> i2.compareTo(i1)); 
	sorted.forEach(System.out::println);
	
	}

}

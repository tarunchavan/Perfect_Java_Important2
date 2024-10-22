
/* package Stream_Api_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// way 1 :: 

public class Even_Number_Stream {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(25);
		arList.add(52);
		arList.add(12);
//
//		List<Integer> list = arList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//		System.out.println(list);

		// arList.stream().filter(i -> i%2==0).forEach(System.out::println);
		
		// arList.stream().filter(i -> i%2==0).forEach(a -> System.out.println(a));
		
		
 // way 2 :: 
		
		Integer myArray[] = {3,4,5,2,3,4,5,6,7};
		
		Stream.of(myArray).filter(x->x%2==0).forEach(System.out::println);
		
		
		
		
		
	}

}

*/
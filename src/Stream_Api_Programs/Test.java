package Stream_Api_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Map example 

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>() ;
		list.add(30) ;
		list.add(78) ;
		list.add(26) ;
		list.add(96) ;
		list.add(79) ;
		
		System.out.println("before grace: "+list);
		
	    List<Integer> updatedMarks = list.stream().map(i -> i+6).collect(Collectors.toList()) ;
		System.out.println("Marks of student after grace: "+updatedMarks);

	}

}

// -----------------------------------
package Stream_Api_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
//1. Sum of All numbers
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
		
	    List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional <Integer> sum = list.stream().reduce((i1,i2)-> i1+i2); 
        System.out.println("Sum of Numbers: "+sum.get());
                 
	}

}
*/
// ---------------------------------------------------
// 2. Print Average of all numbers:: 

/*
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(1,2,3,4,5,33,44,22,12,34,0) ;
		
		Double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("avg is: "+avg);
			
	}
}
	*/
// -------------------------------------------------------
//3. NumberSquareAverage:: 

/*
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,10,20,30,15) ;
		
		double avg = list.stream().map(i -> i*i).filter(x -> x>100).mapToInt(e -> e).average().getAsDouble();
		System.out.println(avg);
		
	}
}
*/
	// ------------------------------------------

//4. Print Even  number using stream 

/*
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
      	
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
	List<Integer> evenlist =  list.stream().filter(i -> i%2==0).collect(Collectors.toList());	
	
	System.out.println(evenlist);
	
	}
}
	
	*/
//-----------------------------------

//5. Print Odd number using stream 

/*
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		List<Integer> oddnum = list.stream().filter(i -> i%2!=0).collect(Collectors.toList());
//		System.out.println(oddnum);
		
		list.stream().filter(i -> i%2!=0).forEach(System.out::println);
		
	}
}
*/
//-------------------------------------------------

/*
//8.  Sort Number using Stream (Ascending)

public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
		  
     List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,13,1,2,2,16,40,19,3,40);
	    
    List<Integer> ascending = list.stream().sorted().collect(Collectors.toList()) ;
     System.out.println(ascending);
		
	}
}
	
*/
// ------------------------------------------------------

//9. Sort Number using Stream (Descending)

/*
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
		  
     List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,13,1,2,2,16,40,19,3,40);
	    
     List<Integer> descending = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()) ;
     System.out.println(descending);
		
	}
}
*/
// -------------------------------------------------------------
//10. find min() number using streams 

/*
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
		  
		Stream<Integer> s=Stream.of(1,2,3,4,5) ;
		Optional<Integer> min = s.min((o1,o2) -> o1.compareTo(o2));
		System.out.println("min:: "+min.get());

	}
}
*/
//------------------------------------------------
//11. find max() number using stream 

/*
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
    Stream<Integer> s4 =  Stream.of(1,2,3,5,6) ;
	Optional<Integer> max = s4.max((o1,o2) -> o1.compareTo(o2));	
    System.out.println("max: "+max.get());
    
	} 
}
*/ 
// --------------------------------------------------
//12. Print duplicate number using stream

/*
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
     		
		List<Integer> list=Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3) ;
				
		Set<Integer> dupNum= new HashSet<Integer>();
		
		List<Integer> dup = list.stream().filter(e -> !dupNum.add(e)).collect(Collectors.toList()); 
        System.out.println(dup);
		
		
	}
}

*/ 

// --------------------------------------------------------
//13. Get/ignore first 5 numbers using limit & skip in streams

/*
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3) ;
		
		//get first 5 numbers
		
		List<Integer> l=list.stream().limit(5).collect(Collectors.toList());
		System.out.println(l);
		
		// sum of 5 numbers
		
		int sum =  list.stream().limit(5).reduce((p,q) -> p+q).get();
		System.out.println(sum);
				
		
	  }
	}
	*/
// ----------------------------------------------------------
// skip:: 

/*
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
    
		List<Integer> list =Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3) ;
		
		List<Integer> l = list.stream().skip(5).collect(Collectors.toList()) ;
		System.out.println(l);
		
		int sum5 = list.stream().skip(5).reduce((a,b) -> a+b).get() ;
		System.out.println(sum5);
		
	}
}

*/
// -------------------------------------------------
// get second highest number using stream :: 
/*
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,40) ;
		 
		int secondhighest = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secondhighest);
				
	   }
	}
*/
//-------------------------------------------------
// second lowest ::

/*
public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,40) ;
		int seconglowest = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(seconglowest);
		
	}
}
*/
// --------------------------------------------------

// IBM Questions :: Java program to find longest string from given array 

public class Naveen_Automation_Codes10 {

	public static void main(String[] args) {
		
		String []strArray = {"Java","Hibernate","Springboot"};
		
		String longestString = Arrays.stream(strArray).reduce((word1, word2) -> word1.length()>word2.length() ? word1: word2).get() ;
		
		
	}
}


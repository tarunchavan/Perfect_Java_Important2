package String_Programs;

public class Count_Character_String {

	public static void main(String[] args) {
		
		String string="The best of both worlds" ;
		int count=1 ;
		for(int i=0;i<string.length()-1;i++) {
			if(string.charAt(i)!=' ') {
				count++ ;
			}
		}
 
		 System.out.println("total number of character in string: "+count);
	}

}



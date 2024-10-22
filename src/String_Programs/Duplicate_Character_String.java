package String_Programs;

// duplicate character in a string ::
 
public class Duplicate_Character_String {

	public static void main(String[] args) {
		String s="Apple" ;
		char a[]=s.toCharArray();
		
		System.out.println("duplicate character in above string is: ");

		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}

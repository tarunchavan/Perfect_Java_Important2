package String_Programs;

public class Reverse_Words {

	public static void main(String[] args) {
		String str="Java Programming language" ;
		
		String str2=" ";
		String words[]=str.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			str2 = str2=words[i] ;
			
		}
      System.out.println(str2+" ");
	}

}

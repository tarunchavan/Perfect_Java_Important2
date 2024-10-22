package star_patterns_important;

// 1.Left Triangle Pattern:

//*
//**
//***
//****
//*****
//public class Naveen_Triangle_Patterns {
//
//	public static void main(String[] args) {
//
//		for (int i = 0; i <= 4; i++) {
//			for (int j = 0; j <=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//	}
//
//}

//2. // Opposite of left triangle pattern 
/*
*****
****
***
**
*

public class Naveen_Triangle_Patterns {
 
 	public static void main(String[] args) {
	
 		for(int i=0;i<=4;i++) {
 			for(int j=4;j>=i;j--) {
 				System.out.print("*");
 			}
 			System.out.println();
 		}
 		
   }
}
*/
//3. combination of Left triangle + opposite of left triangle 

/*
*
**
***
****
*****
*****
****
***
**
*

public class Naveen_Triangle_Patterns {

	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

*/
//4. by java tpoint
//A
//B B
//C C C
//D D D D
//E E E E E
//
//public class Naveen_Triangle_Patterns {
//
//	public static void main(String[] args) {
//          int n=4; 
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print(" "+(char)(65+i));
//			}
//			System.out.println("");
//		}
//		
//	}
//}
//5. javat
//
// 1111111111
// 1        1
// 1        1
// 1        1
// 1        1
// 1        1
// 1        1
// 1        1
// 1        1
// 1111111111

//public class Naveen_Triangle_Patterns {
//
//	public static void main(String[] args) {
//
//		for (int i = 1; i <= 10; i++) {
//			for (int j = 1; j <= 10; j++) {
//				if (i == 1 || i == 10 || j == 1 || j == 10)
//					System.out.print("1");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
//
//	}
//}
// -----------------------------
//check jtp-13
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

public class Naveen_Triangle_Patterns {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}
}

// 
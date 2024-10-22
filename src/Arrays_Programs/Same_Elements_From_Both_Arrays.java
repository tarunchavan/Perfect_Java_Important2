package Arrays_Programs;

//Common elements from both Arrays::

public class Same_Elements_From_Both_Arrays {

	public static void main(String[] args) {

		int arr1[] = { 8, 15, 6, 21, 25, 20 };
		int arr2[] = { 3, 8, 9, 15, 6, 21 };

		int i, j;

		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
				}
			}
		}

	}

}

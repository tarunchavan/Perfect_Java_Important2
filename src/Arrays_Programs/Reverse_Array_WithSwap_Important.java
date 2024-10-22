package Arrays_Programs;

//Reverse array using swap 
public class Reverse_Array_WithSwap_Important {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 1, 5, 6 };

		// Reverse the array using the reverseArray method
		reverseArray(arr);

		// Print the reversed array
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	// Method to reverse the array
	private static void reverseArray(int[] array) {
		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			// Swap elements
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;

			// Move pointers towards the center
			left++ ;
			right--;

		}
	}
}

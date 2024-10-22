package J_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 1. Occurence ::

// 2. Duplicate number :: 

/*
public class Example2_Occurrence {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 6, 2, 3, 4, 7, 8, 92, 5, 4, 7 };

		Map<Integer, Integer> hashmap = new HashMap<>();

		for (int word : a) {
			if (hashmap.get(word) != null) {
				hashmap.put(word, hashmap.get(word) + 1);
			} else {
				hashmap.put(word, 1);
			}
		}
		System.out.println(hashmap);

	}
}

*/
//2. 

/*
public class Example2_Occurrence {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(160);
		list.add(1);
		list.add(2);

		Object[] numbers = list.toArray();

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer word : numbers) {
			if (map.get(word) != null) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}

		// print a duplicate number

		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			if (map.get(key) > 1) {
				System.out.println(key);
			}
		}

	}
}
*/
//----------------------------
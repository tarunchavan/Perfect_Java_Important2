package com.collections_programs;

import java.util.HashSet;
// how to copy set content to another hashset : 

public class Copy_Set_To_Another_HashSet {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println(hs);
		HashSet<String> subSet = new HashSet<String>();
		subSet.add("s1");
		subSet.add("s2");
		hs.addAll(subSet);
		System.out.println("HashSet content after adding another collection: ");
		System.out.println(hs);

	}
}

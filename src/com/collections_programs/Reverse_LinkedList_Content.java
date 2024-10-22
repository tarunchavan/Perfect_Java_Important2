package com.collections_programs;

import java.util.Collections;
import java.util.LinkedList;

//1. How to Reverse LinkedList Content : 
//2. How to Shuffle elements in LinkedList: 

/*
public class Reverse_LinkedList_Content {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");

		Collections.reverse(list);
		System.out.println("Results after reverse operation: ");
		for (String s : list) {
			System.out.println(s);
		}

	}
}
*/
//------------------------------------------------------

//2. How to Shuffle elements in LinkedList: 

public class Reverse_LinkedList_Content {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		list.add("Movie");
		list.add("Girl");

		Collections.shuffle(list);

		System.out.println("Result after shuffle operation: ");
		for (String str : list) {
			System.out.println(str);
		}

	}
}

package CoreJavaBasics;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
		
		// how to declare array list
		
		ArrayList list = new ArrayList(); //we can store any type of elements
		//ArrayList<Integer>list = new ArrayList<Integer>();
		//ArrayList<String>list = new ArrayList<String>();
		
		//Add values to arraylist (dupicates are allowed)
		list.add("John");
		list.add("David");
		list.add(200);
		list.add('G');
		list.add(7777);
		
		//size of arraylist
		System.out.println("before removing elements");
		System.out.println(list.size()); //5
		System.out.println(list);
		
		//remove an element
		System.out.println("after removing elements");
		list.remove(2);//remove adam
		System.out.println(list.size()); //4
		System.out.println(list);
		
		//inserting a new element into array list
		list.add(1, "Amit");
		System.out.println("after inserting elements");
		System.out.println(list.size()); //5
		System.out.println(list);
		
		//read values using Loop statements for loop
		
		System.out.println("printing list using for loop");
		for(Object s:list) // Object Type variable can hold any type of values
		{
			System.out.println(s);
		}
		
		
	}

}

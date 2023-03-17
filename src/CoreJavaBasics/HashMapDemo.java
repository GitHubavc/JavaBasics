package CoreJavaBasics;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//declaration
		//HashMap hm = new HashMap();
		
		HashMap<Integer,String> hm = new HashMap<Integer,String> ();
		
		//Adding pair (keys are unique but values can be duplicated)
		 hm.put(101, "John");
		 hm.put(102, "Adam");
		 hm.put(103, "Ken");
		 hm.put(104, "Mike");
		 hm.put(105, "Sam");
		 
		 //Print
		 
		 System.out.println(hm);
		 
		 //Remove a pair from hashmap
		 
		 hm.remove(103);
		 System.out.println("After removing the pair");
		 System.out.println(hm);
		 
		 //reading pairs using for loop
		 
		 for(Map.Entry  m:hm.entrySet())
		 {
			 System.out.println(m.getKey()+ "  " +m.getValue());
		 }
		 
		 
		 
		

	}

}

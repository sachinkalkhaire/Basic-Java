package Day20;

import java.util.HashMap;


public class HashMapDemo3 {

	public static void main(String[] args) {
		/*
		HashMap:
		        1.data store in form of key and value pair.
		        2.key is unique(duplicate not allowed), but we can have duplicate value.
		        3.insertion order is not preserve.
		        4.non indexed collection.


		 */

		HashMap<Integer,String> hm=new HashMap<Integer,String> ();
		hm.put(101, "anisha");
		hm.put(102, "john");
		hm.put(103, "mary");
		hm.put(104, "jash");
		hm.put(105, "nikee");

		System.out.println(hm);        //{101=anisha, 102=john, 103=mary, 104=jash, 105=nikee}
		System.out.println(hm.size()); //5

		//remove paire
		hm.remove(105);
		System.out.println(hm);        //{101=anisha, 102=john, 103=mary, 104=jash}

		//get specific value
		System.out.println(hm.get(104)); //jash.

		//get all keys from hashMap
		System.out.println(hm.keySet());   //[101, 102, 103, 104]
		System.out.println(hm.values());   //[anisha, john, mary, jash]
		System.out.println(hm.entrySet()); //[101=anisha, 102=john, 103=mary, 104=jash]

		//read the data  hashMap
		for(int k:hm.keySet())
		{
			System.out.println(k+"     "+hm.get(k));
		}
		/*  output:
		    101     anisha
            102     john
            103     mary
            104     jash
		 */

		hm.clear();
		System.out.println(hm.isEmpty());   //true
	}

}

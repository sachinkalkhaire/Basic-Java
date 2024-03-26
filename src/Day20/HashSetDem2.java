package Day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDem2 {

	public static void main(String[] args) {
		/*
		 
		 HashSet:is class which is implements set interface
		          1.Duplicate element not allowed
		          2.not indexed collection
		          3.insertion order not preserved
		          4.multiple null are not allowed(single null allowed)
		          5.Heterogeneous data allowed(different data type )
		 	 		 
*/
		//Declaration
		//HashSet<String> set=new HashSet<String>();  //homogeneous data
		HashSet set1=new HashSet();                    //Heterogeneous data
		
		//Adding element in to hashSet
		set1.add(101);
		set1.add(10.5);
		set1.add("welcome");
		set1.add('A');
		set1.add(true);
		set1.add(100);
		set1.add(100);
		set1.add(null);
		set1.add(null);
		
		//print hashSet and size
		System.out.println(set1);  //[null, A, 100, 101, 10.5, welcome, true]
		System.out.println(set1.size());  //7
		
		//remove data
		set1.remove(10.5);
		System.out.println(set1);  //[null, A, 100, 101, welcome, true]
		
		//inserting data....>not possible in set
		
		//Access specific value...>not possible
		
		//covert hashSet to arrayList
		ArrayList l1=new ArrayList(set1);
		System.out.println(l1);          //[null, A, 100, 101, welcome, true]
		System.out.println(l1.get(2));   //100
		
		//read the data for set
		//using for..each loop
		for(Object i:set1)
		{
			System.out.println(i);   //null, A, 100, 101, welcome, true
		}
		
		//using Iterator
		
		Iterator<Object> it=set1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());   //null, A, 100, 101, welcome, true
		}
		
		//clearing all element
		
		set1.clear();
		System.out.println(set1.isEmpty());  //true
		
	}

}

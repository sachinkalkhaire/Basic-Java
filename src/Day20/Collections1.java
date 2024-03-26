package Day20;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections1 {

	public static void main(String[] args) {
		
		/*
		Collection: collections is a framework that provide structure to store and manipulate the group of object.
		            1.is a java interface...having two child interface...1.list...2.set.
		            2.collection represent group of object.
		
		list...>ArrayList
		set....>hashSet
		
		ArrayList:is class which is implements list interface
		          1.Duplicate element allowed
		          2.indexed collection
		          3.insertion order preserved
		          4.multiple null are allowed
		          5.Heterogeneous data allowed(different data type )
		          
		*/
		
		//		ArrayList:
		
	   //ArrayList<Integer> list =new ArrayList<Integer>();  //declaration...> allowed only integer type data(homogeneous)
		
		 ArrayList list =new ArrayList();  //declaration...>  allowed to all type data(heterogeneous)(
		list.add(101);
		list.add(10.5);
		list.add("welcome");
		list.add('A');
		list.add(true);
		list.add(100);
		list.add(null);
		list.add(null);
		list.add(null);
		
		//size of arrayList
		System.out.println(list.size());    
		
		//print list of element
		System.out.println(list);     //[101, 10.5, welcome, A, true, 100, null, null, null]       
		
		//remove element from arrayList
		list.remove(5);                //indexed start from 0...>5 =100 remove
		System.out.println("list after remove element: "+list); //[101, 10.5, welcome, A, true, null, null, null]
		
		//insert element in arreayList
		list.add(3, "java");
		System.out.println("list after insert element: "+list); //[101, 10.5, welcome, java, A, true, null, null, null]
		
		//modification/replace/change element java ..>python
		list.set(3, "pyton");
		System.out.println("list after replace element: "+list);  //[101, 10.5, welcome, pyton, A, true, null, null, null]
		
		//access specific element
		System.out.println(list.get(3));
		
		//reading all the element from arrayList
		
		//using normal for..loop
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//using for...each loop
		
		for(Object i: list)
		{
			System.out.println(i);
		}
		
		//using iterator
		//Iterator<String> it=list.iterator();
		Iterator<Object> it=list.iterator();
		while(it.hasNext())          //it is used to call next iteration...>reaped loop
		{
			System.out.println(it.next());  //101, 10.5, welcome, pyton, A, true, null, null, null
		}
		
		//check arrayList is empty or not
		
		System.out.println(list.isEmpty());  //false
	
		
		//remove all element in arrayList
		
		ArrayList list2=new ArrayList();    //Create new list2
		list2.add(101);
		list2.add("welcome");
		
		
		list.removeAll(list2);     //Before remove...> 101, 10.5, welcome, pyton, A, true, null, null, null
		System.out.println(list);  //after remove ...>10.5, pyton, A, true, null, null, null
		
		//remove all elements/clear
		list.clear();
		System.out.println(list.isEmpty());//true
	}

}

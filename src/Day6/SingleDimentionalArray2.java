package Day6;

public class SingleDimentionalArray2 {

	public static void main(String[] args) {

		/*
		 1.single dimensional array:
             it's consist only rows
             a.decleard an arry
             b.add value into array
             c.find size of an array
             d.read single value from an array
             e.read multiple value from an array
		 */

		// a.decleard an arry:
		/*	
		//approach 1
		int a[]=new int[5]; // fixed size array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		 */

		//approach 2  
		int a[]= {100,200,300,400,500};  //not fix size..in feature we can change size

		//c.find size of an array		
		System.out.println("size of an array:"+(a.length));

		//d.read single value from an array
		System.out.println("read single value an array:"+(a[3]));
		/*	
	 //e.read multiple value from an array
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);//  index start from 0 so give size <a.length ....i=0,1,2,3,4
	}

		 */

		//enhanced for loop
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}

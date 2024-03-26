package Day6;

public class Two_MultiDimensionalArray3 {

	public static void main(String[] args) {
		/*	
		 2. multi/two dimensional arry

         1.two dimensional array:
         it's consider row and coloum data..table format data
         a.decleard an array
         b.add value into array
         c.find size of an array
         d.read single value from an array
         e.read multiple value from an array
		 */

		// a.decleard an array

		/*	//approach 1
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;

		a[1][0]=300;
		a[1][1]=400;

		a[2][0]=500;
		a[2][1]=600;
		 */

		//approach 2
		
		// a.decleard an array
		int a[][]= {{100,200},{300,400},{500,600}};
		
		// c.find size of an array
		System.out.println("total number of row:"+(a.length));    //3
		System.out.println("total number of colums:"+(a[0].length));//2
		
		//d.read single value from an array
		System.out.println(a[1][0]);     //300
		
		// e.read multiple value from an array
	/*	
		//normal for loop
		for(int i=0;i<a.length;i++)  //0..1..2
		{
			for(int j=0;j<a[i].length;j++) //0 1 ..0 1..0 1
			{
				System.out.println(a[i][j]); //100 200 , 300 400 , 500 600  
			}
		}
		*/
		
		//advanced for loop
		for (int i[]:a)
		{
			for(int r:i)
			{
				System.out.println(r);
			}
		}
		
	}

}

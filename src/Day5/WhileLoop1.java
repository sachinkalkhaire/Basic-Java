package Day5;

public class WhileLoop1 {

	public static void main(String[] args) {
		/*
		 //Looping statement: specific  statement executed repeatedly based on conditions
		 1. while
		 2. do..while
		 3. for
		 4. enhanced for loop
		  
		  //initialization(where to start)
		   //condition(how many times)
		   //increment/decrement(++/--)
		  
		  //while loop:
		  while(condition) 
		  {
		  statements;
		  inc/dec(++/--);
		  }
		   
		 */
		
	/*	//example 1:print 1 to 10 number
		
		int i=1;      //initialization
		while(i<=10)  //condition
		{
			System.out.println(i);
			i++;      //increment
		}
*/
	/*	//example 2:print hello message 10 times
		
		int i=1;
		while(i<=10)  
		{
			System.out.println("Hello");
			i++;
		}
		*/
/*
			//example 3:print even number
		
			//Approch 1
			int i=1;
			while(i<=10)  
			{
				System.out.println(i);
				i+=2;  //i=i+2
			}
		*/
		/*	//Approch 2
			int i=1;
			while(i<=10)  
			{
				if(i%2==0)
				{
				System.out.println(i);
				}
				i++;  
			}
			*/
		
			//example 4:print number is even or odd
		//1:odd
		//2:even
		//3:odd
		
		/*	int i=1;
			while(i<=10)  
			{
				if(i%2==0)
				{
				System.out.println("even number:"+i);
				}
				else
				{
					System.out.println("odd number:"+i);	
				}
				i++;  
			}*/
			
			//example 5:
			int i=10;      //initialization
			while(i>=1)  //condition
			{
				System.out.println(i);
				i--;      //increment
			}
	}

}

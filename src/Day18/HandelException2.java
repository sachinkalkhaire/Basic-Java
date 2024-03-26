package Day18;

public class HandelException2 {

	public static void main(String[] args) {
/*
		
		how to handle exceptions:
		  try...catch block
		  throws keyword
		
*/
		//Example 1
		int a=100;
		try
		{
		System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println("invalid data " +e);
		}
		}
	
	

}

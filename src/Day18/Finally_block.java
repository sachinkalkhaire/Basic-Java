package Day18;

public class Finally_block {

	public static void main(String[] args) {
		/*
		//finally block: it is writing after catch block
		conditions:finally block always executed.
			1.try block through the exception catch block handel this exception finally block will be exicuted.
			2.try block through the exception catch block not handel this exception finally block will be exicuted.
			3.try block not through the exception  ignore catch block an finally block will be exicuted.
		
			//Example:
		
		try
		{
			//open file
		}
		catch(Exception e)
		{
		     //suppose file not fount...
		}
		finally
		{
			//close the file
		}
		
		
		*/
		String s= null;
		try
		{
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("catch block will be executed");
		}
		finally
		{
			System.out.println("finally block will be executed");
		}
		
		//output:java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
		         //catch block will be executed
		         //finally block will be executed
	}

}

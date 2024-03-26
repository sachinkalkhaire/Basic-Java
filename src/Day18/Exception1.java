package Day18;



/*
Exception- is a event that disturb normal flow of program execution.

Error- error is a human mistake.. during the coding dev. have some mistake.
       1.syntax error.
       2.logical error.


         1.checked exception.
           a.checked by compiler.
           b.this exception through coding(compile) time.
           c.handel exception by using
             i)try..catch block- handed statement level.
             ii) throws keyword-  handed method level.
           d.examples: 
                     IOException, interrupted exception, file not fount exception


         2.unchecked exception
            a.not checked by compiler.
            b.this exception through runtime time.
            c.handel exception by using
              i)try..catch block- handed statement level.
            d.examples:
                      number format exception,array index out of bond exceptions,null point exception

 */

public class Exception1 {

	public static void main(String[] args) {

		System.out.println("program is started");
    /*
		//Example : 1
		int a=100;
		System.out.println(a/0);     //Arithmetic exception
   */
/*	
		//Example : 2
		String s="welcome";
		int c= Integer.parseInt(s);
		System.out.println(c);         //number format exception
*/
		
	/*	
		int arry[]=new int[5];
		arry[6]=10;
		System.out.println(arry[6]);   //ArrayIndexOutOfBoundsException
   */
/*		String s1=null;
		System.out.println(s1.length()); //NullPointerException    
*/
		
		System.out.println("program is completed");
		System.out.println("program is exited");

	}

}

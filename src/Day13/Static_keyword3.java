package Day13;

public class Static_keyword3 {

	/*static keyword- stati keyword applicable for variables and methods.
	 1.static variables.
	 2.static methods.

	 non static variable.
	 non static methods.	 

	 */
	static int a=10;    //static variable.
	int b=20;           // non-static variable.

	static void m1()    //static method
	{
		System.out.println("this is static method");
	}

	void m2()    //non-static method
	{
		System.out.println("this is non-static method");
	}

	void nonStaticMethod()   //non-static method directly access static as well as non-static stub;
	{
		System.out.println(a+" "+b);
		m1();
		m2();
	}

	public static void main(String[] args) {

		//static method directly access static stub without creating and object.
		System.out.println(a);     //main is static method
		m1();      //directly access static stub  // method are present in other calss so call method or variables as className.methoName or variableName.
		
		//static method access non-static stub through object
		Static_keyword3 sk=new Static_keyword3();
		System.out.println(sk.b);
		sk.m2();
		
		 //non-static method directly access static as well as non-static stub;
		sk.nonStaticMethod();
		
	}

}

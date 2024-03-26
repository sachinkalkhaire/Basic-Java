package Day16;

interface A
{
	int x=10;   //final static variable by default
	void m1();  //abstract method
}

interface B
{
	int y=20;
	void m2();    //abstract methods
	
	//after java 8 add those methods
	default void m3()  //default methods
	{
		System.out.println("this is defsult method");
	}
	
	static void m4()  //static methods
	{
		System.out.println("this is public method");
	}
}


public class Interface2 implements A,B {  //class implements interface
	public void m1()
	{
		System.out.println(x);
	}


	public void m2()
	{
		System.out.println(x+y);
	}


	public static void main(String[] args) {
		
		Interface2 in =new Interface2();
		in.m1();
		in.m2();
		in.m3();
		B.m4();  //static method call directly interfaceName.methodName
				         
		//create interface object but not instantiate object
		
		A obj =new Interface2();
		obj.m1();
	}

}

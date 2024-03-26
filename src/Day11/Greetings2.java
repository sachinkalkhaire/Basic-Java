package Day11;

public class Greetings2 {

	//1.no parameter   -- no return value

	void m1()
	{
		System.out.println("Hello...");
	}

	//2.no parameter   -- return value
	String m2()
	{
		return ("Hello...");
	}

	//3.takes parameter-- no return value

	void m3(String name)
	{
		System.out.println("Hello..."+name);
	}
	
	//4.takes parameter-- return value
	
	String m4(String name)
	{
		return("Hello..."+name);
	}
}

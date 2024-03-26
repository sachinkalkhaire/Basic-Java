package Day12;

public class mainMethodOverload {

	// can you overload main method: yes, but main method are created before actual main method.
	
	void main(int x)
	{
		System.out.println(x);
	}
	
	void main(String s)
	{
		System.out.println(s);
	}
	
	void main(String s, String r)
	{
		System.out.println(s+" "+r);
	}
	
	public static void main(String[] args) {
		// can you overload main method: yes, but main method are created before actual main method.

		mainMethodOverload overlod= new mainMethodOverload();
		overlod.main(10);
		overlod.main("welcome to java");
		overlod.main("java", "selenium");
		
		
	}

}

package Day12;

public class MethodOverloading2 {
	
	
	void add(int a, int b)//1
	{
		System.out.println(a+b);
	}
	
	void add(int a, double b)//2
	{
		System.out.println(a+b);
	}
	
	void add(double a, double b)//3
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c)//4
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		MethodOverloading2 overload=new MethodOverloading2();
		overload.add(10, 20);
		overload.add(10, 20.5);
		overload.add(10.5, 20.5);
		overload.add(10, 20, 30);
	}

}

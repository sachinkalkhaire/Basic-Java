package Day12;

public class ConstructorOverloading3 {
	
	ConstructorOverloading3(int a, int b)
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloading3(int a, double b)
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloading3(double a, double b)
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloading3(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		//ConstructorOverloading3 cv=new ConstructorOverloading3(10,20);
		//ConstructorOverloading3 cv1=new ConstructorOverloading3(10,20.5);
		//ConstructorOverloading3 cv2=new ConstructorOverloading3(10.5,20.5);
		//ConstructorOverloading3 cv3=new ConstructorOverloading3(10,20,30);
		
	}

}

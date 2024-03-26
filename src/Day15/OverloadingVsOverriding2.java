package Day15;

class ABC{

	void m1(int x)
	{
		System.out.println(x);
	}

	void m2(int y)
	{
		System.out.println(y);
	}
}

class XYZ extends ABC{

	void m1(int x)  //overriding
	{
		System.out.println(x*x);
	}

	void m2(int y, int x)  //overloading
	{
		System.out.println(y+x);
	}
}


public class OverloadingVsOverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XYZ obj=new XYZ();
		obj.m1(10);
		obj.m2(20);
		obj.m2(30, 40);
	}

}    

package Day13;

public class ThisKyeword_constructor_2 {
	
	//java variables-1.local variable(method level), 2.instance variable(class level).
	// java don't have global variable
	
	ThisKyeword_constructor_2()
	{
		this(10);
		System.out.println("this is non parameterized constructor");
	}
	
	ThisKyeword_constructor_2(int x)
	{
		this(10,20);
		System.out.println(x);
	}
	ThisKyeword_constructor_2(int x, int y)
	{
		System.out.println(x+y);
	}
	
	void dispaly()
	{
		System.out.println("constructor invoke");
	}

	public static void main(String[] args) {
		ThisKyeword_constructor_2 tcon= new ThisKyeword_constructor_2();
		tcon.dispaly();
	}

}

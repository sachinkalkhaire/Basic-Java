package day14;

//1.single inheritance.


class A
{
	int x;
	void m1()
	{
		System.out.println(x);
	}
}

class B extends A
{
	int y;
	void m2()
	{
		System.out.println(x+y);	
	}
}

public class singel_Inheritance1 {


	public static void main(String[] args) {

		B obj =new B();
		obj.x=10;
		obj.y=20;

		obj.m1();
		obj.m2();

	}

}

package day14;
//4.multiple inheritance-multiple parent class having single child class
//use interface

interface I1
{
	int x=10;
	void m1();
}

interface I2
{
	int y=20;
	void m2();
}

class H implements I1,I2
{
	public void m1()
	{
		System.out.println(x);
	}
	public void m2()
	{
		System.out.println(y);
	}
	
	
}

public class multipleInheritance4 {

	public static void main(String[] args) {
		H obj =new H();
		obj.m1();
		obj.m2();
		
	}

}

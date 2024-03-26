package day14;
//2.multilevel inheritance

class A1
{
	int x;
	void m1()
	{
		System.out.println(x);
	}
}

class B1 extends A1
{
	int y;
	void m2()
	{
		System.out.println(x+y);	
	}
}

class C1 extends B1
{
	int z;
	void m3()
	{
		System.out.println(x+y+z);	
	}
}

public class multiLevelInheritance2 {

	public static void main(String[] args) {
		C1 obj =new C1();
		obj.x=100;
		obj.y=200;
		obj.z=300;
		obj.m1();  //100
		obj.m2();  //300
		obj.m3();  //600
	}

}

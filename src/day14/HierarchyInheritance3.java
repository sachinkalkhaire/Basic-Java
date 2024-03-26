package day14;

//3.HierarchyInheritance- single parent having multiple child classes

class P1
{
	int a;
	void m1()
	{
		System.out.println(a);
	}
}

class C11 extends P1
{
	int b;
	void m2()
	{
		System.out.println(b+a);
	}
}

class C22 extends P1
{
	int c;
	void m3()
	{
		System.out.println(c+a);
	}
}


public class HierarchyInheritance3 {


	public static void main(String[] args) {

		C11 obj1=new C11();
		obj1.a=100;
		obj1.b=200;
		obj1.m1();    //100
		obj1.m2();    //300

		C22 obj2=new C22();
		obj2.a=100;
		obj2.c=300;
		obj2.m1();   //100
		obj2.m3();  //400
	}

}

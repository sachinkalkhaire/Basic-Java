package day14;

//Hybrid inheritance: it is a combination between hierarchical and multiple inheritance

class C33
{
	int x;
	void m1()
	{
		System.out.println(x);
	}
}

interface I31
{
	int y= 10;
	void m2();
}

interface I32
{
	int z= 20;
	void m3();
}


public class Hybride_inheritance extends C33 implements I31,I32    {
	public void m2()
	{
		System.out.println(y);
	}

	public void m3()
	{
		System.out.println(z);
	}

	     public static void main(String[] args) {
	    	 Hybride_inheritance obj =new Hybride_inheritance();
	    	 obj.x=100;
	    	 obj.m1();
	    	 obj.m2();
	    	 obj.m3();
	    	 
	    	 
	}

}

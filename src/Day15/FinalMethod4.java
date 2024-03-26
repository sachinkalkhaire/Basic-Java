package Day15;

class A
{
	final void m1()
	{
		System.out.println("method m1");
	}
}
class B extends A
{
	
	//void m1()  //cannot override final method in child class
	{
		System.out.println("method m2");
	}
}

public class FinalMethod4 {

	
	public static void main(String[] args) {
		
	
	}

}

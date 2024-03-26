package Day11;

public class ConstructorTypes {
	
	//Constructor: 
	//1.Default constructor.
	//2. Parameterized constructor
	
	
	ConstructorTypes()  //default constructor
	{
		System.out.println("i'm default constructor");
	}
	
	ConstructorTypes(int x,int y)   //parameterized constructor
	{
		System.out.println(x+y);

	}
	
	void display()
	{
		System.out.println("invok constructor");
	}
	
	
	public static void main(String[] args) {
		ConstructorTypes con=new ConstructorTypes(); //default constructor
		con.display();
		
		ConstructorTypes con1=new ConstructorTypes(11,22);  //parameterized constructor
		con1.display();
		
	}

}

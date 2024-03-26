package Day15;

//super keyword- 1.invoke immediate parent class variable
//               2.invoke immediate parent class method


class animals
{
	String color="white";
	void eat()
	{
		System.out.println("eating.....");
	}
}

class dog extends animals
{
	String color="black";

	void display()
	{
		System.out.println(super.color);
	}

	void eat()
	{
		super.eat();
	}
}

public class SuperKeyword6 {

	public static void main(String[] args) {
		dog d=new dog();
		d.display();
        d.eat();
	}

}

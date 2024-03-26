package Day4;

public class Nated_If3 {

	public static void main(String[] args) {


		//check number is positive or negative

		int num=100;
		if(num<0)
		{
			System.out.println("number is negative");
		}

		else if(num>0)
		{
			System.out.println("number is positive");
		}
		else if(num==0)
		{
			System.out.println("number is zero");
		}


		//find largest of 3 number
		int a=10;
		int b=20;
		int c=30;

		if(a>b && a>c)
		{
			System.out.println("a is largest number" +a);
		}

		else if(b>a && b>c)
		{
			System.out.println("b is largest number" +b);
		}
		else if(c>a && c>b)
		{
			System.out.println("c is largest number" +c);
		}

	}
}


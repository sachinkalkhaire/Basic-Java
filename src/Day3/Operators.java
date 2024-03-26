package Day3;

public class Operators {

	public static void main(String[] args) {
		//Operators:
		
		//1.Arithmetic: +,-,*,/,%;
		
		System.out.println("Arithmetic: +,-,*,/,%");
		
		int a=20; int b=10;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);  //2
		System.out.println(a%b);  //0
		
		//2.Relational: <,>,<=,>=,!=,==;
		
		System.out.println("2.Relational: <,>,<=,>=,!=,==");
		
		System.out.println(a<b); //false
		System.out.println(a>b); //true
		System.out.println(a<=b);//false
		System.out.println(a>=b);//true
		System.out.println(a!=b);//true
		System.out.println(a==b);//false
		
		//3.Logical:&&,||,!;
		
		boolean x=true;
		boolean y=false;
		
		System.out.println("3.Logical:&&,||,!");
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		
		
		
		//4.Increment & decrement operator:++,--;
		
		System.out.println("4.Increment & decrement operator:++,--");
		for(int i=1; i<=10; i++)
		{
			System.out.println("incremental operator:"+i);
		}
		
		for(int i=10; i>=1; i--)
		{
			System.out.println("decremental operator:"+i);
		}
		
		
		//5.Assignment:=,+=,-=,*=/=,%=;
		
		System.out.println("5.Assignment:=,+=,-=,*=,/=,%=;");
		int s=10;
		s%=2;
		System.out.println(s);
		
		/*
		i=i+5  //i+=5
		
		i=i-5  //i-=5
		
		i=i*5  //i*=5
		
		a=a/5  //a/=5
		
		a=a%5  //a%=5
		
		*/
		
		
		//6.conditional/ternary: ?,:  ;
		
		System.out.println("6.conditional/ternary: ?,:");

int m=20;
int n=30;
int l=(m<n)? 100:200;   ///when condition is true i=100, condition is false i=200 print
System.out.println(l);

	}

}

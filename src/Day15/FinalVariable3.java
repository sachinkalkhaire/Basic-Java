package Day15;

public class FinalVariable3 {
	/*
//final keyword- it is applicable for
               1.variable level- final means constant..we cannot chamge value of variable.
               2.method level - final method cannot override.
               3.class level- final class is immutable. we cannot access final class in other class

	 */
	
	//final variable
	
	final int x=10;
	void m1()
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		FinalVariable3 f=new FinalVariable3();
		//f.x=10;   //we cannot change final variable value
		f.m1();

	}

}

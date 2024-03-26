package Day13;

public class ThisKeyword_1 {
	/*
	//this keyword- it is used to different set class and methods variables(instance and local variables)
	                this.x=x - identify this.x the x is a class variable.
	                this keyword used in constructor to call one constructor to the another constructor 
	                becous of only one constructor invoke at time.
	                  
*/
	int x;        //class variable/ instance variable
	int y;

	void add(int x, int y)   //local variable
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}


	public static void main(String[] args) {
		ThisKeyword_1 th=new ThisKeyword_1();
		th.x=100;
		th.y=200;
		th.display();

	}

}

package Day11;

public class Student3 {

	//how many ways to store data into variables

	//1.using object reference variable

	int sid;
	String sname;
	char grad;
	void printStudentData()
	{
		System.out.println(sid+" "+sname+" "+grad);
	}

	//2.using method
	void setStudentData(int id,String name,char grade)
	{
		sid=id;
		sname=name;
		grad=grade;
		System.out.println(sid+" "+sname+" "+grad);
	}
	
     //3.using constructor:
	Student3(int id,String name,char grade)
	{
		sid=id;
		sname=name;
		grad=grade;
		
	}





	public static void main(String[] args) {
		
		/*Student3 std=new Student3();

		//1.object reference variable
		std.sid=101;
		std.sname="sam";
		std.grad='A';
		std.printStudentData();

		//2.using method
		std.setStudentData(102, "himansh", 'B');   */
		
		//3.using constructor:
		
		Student3 stu=new Student3(101,"radha",'A');
		stu.printStudentData();
	}

}

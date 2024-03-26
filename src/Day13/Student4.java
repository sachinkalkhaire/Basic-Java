package Day13;

public class Student4 {

	//1.static variables.
	int stuId;
	String stuName;
	char stuGrade;
	static int stuClass=9;

	void studentDetais()
	{
		System.out.println(stuId+" "+stuName+" "+stuGrade+" "+stuClass);
	}


	public static void main(String[] args) {
		Student4 stu1=new Student4();
		stu1.stuId=101;
		stu1.stuName="sham";
		stu1.stuGrade='A';
		stu1.studentDetais();

		Student4 stu2=new Student4();
		stu2.stuId=102;
		stu2.stuName="Ram";
		stu2.stuGrade='B';
		stu2.studentDetais();

	}

}

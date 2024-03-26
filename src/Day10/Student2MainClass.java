package Day10;

//Supposed class is present in other packge then we can access class by using import packName.className 

public class Student2MainClass {

	public static void main(String[] args) {
		
		Student2 emp1=new Student2();
		emp1.studentId=101;
		emp1.studentName="john";
		emp1.studentClass=9;
		emp1.studentGread='A';
		emp1.display();
		
		System.out.println("...........object 2.........");
		
		Student2 emp2=new Student2();
		emp2.studentId=102;
		emp2.studentName="sham";
		emp2.studentClass=9;
		emp2.studentGread='B';
		emp2.display();
		
	}

}

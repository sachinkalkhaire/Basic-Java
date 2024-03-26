package Day9;

public class StringComparison {

	public static void main(String[] args) {
		
		//String Comparison
		//==:  to compare object
		//equal : to compare value
		
		//ex.1
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);  //true       //to compare object
		System.out.println(s1.equals(s2)); //true  //to compare value

		//ex.2
		String s3=new String("welcom");
		String s4=new String("welcom");
		System.out.println(s3); 
		System.out.println(s4); 
		System.out.println(s3==s4);        //false  //to compare object
		System.out.println(s3.equals(s4)); //true   //to compare value
	}

}

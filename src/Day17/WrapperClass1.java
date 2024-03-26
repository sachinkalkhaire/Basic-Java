package Day17;

/*
    Wrapper class:convert data one format to the another format.
    Scenario 1: String------>int,double,boolean,char

    Scenario 2: int,double,boolean,char----->String

    1.String---->int        //Integer.parseInt(String value);
    2.String---->double     //Double.parseDouble(String value);
    3.String---->boolean    //Boolean.parseBoolean(String value);
    4.String---->char       ...>not possible


//used wrapper class in automation
ArrayList<Integer> list=new ArrayList<Integer>();  //valid

ArrayList<int> list=new ArrayList<int>();  //invalid

 */

public class WrapperClass1 {

	public static void main(String[] args) {

		////Scenario 1: String------>int,double,boolean,char

		//	String r="welcome";  //not possible
		String s= "1527";
		System.out.println(Integer.parseInt(s));//1527      //String---->int  
		System.out.println(Double.parseDouble(s));//1527.0	//String---->double

		String sn="false";
		System.out.println(Boolean.parseBoolean(sn));//false //String---->boolean

		//System.out.println(Character.parseChar(s));	  //not possible

		//Example 1: addition between two string
		String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));//30

		//Example 2: addition between two string double data type
		String s3="10.5";
		String s4="20.9";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));  //31.4


		//  Scenario 2: int,double,boolean,char----->String
		int a=10;
		double b=20.5;
		boolean bool= true;
		char r='d';

		System.out.println(String.valueOf(a));    //10
		System.out.println(String.valueOf(b));    //20.5
		System.out.println(String.valueOf(bool)); //true
		System.out.println(String.valueOf(r));   //d
	}

}

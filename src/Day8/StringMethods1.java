package Day8;

import java.util.Arrays;

public class StringMethods1 {

	public static void main(String[] args) {
		//String methods:

		//1.length():find string length
		String s="welcome";

		System.out.println(s.length());  //7

		//2.concat():joining string
		String s1="welcome";
		String s2=" to java";
		String s3=" automation";
		System.out.println(s1.concat(s2));//join 2 strings
		System.out.println(s1.concat(s2).concat(s3));//join 3 strings

		//3.trim(): remove spaces right and left
		String s4=" hello  ";
		System.out.println(s4.length());
		System.out.println(s4.trim());
		System.out.println(s4.trim().length());

		//carAT():FIND specific character
		String s5="welcome";
		System.out.println(s5.charAt(3));

		//contains():return true or false..check it is part of string or not
		String s6="this is first test";
		System.out.println(s6.contains("first"));

		//equals():
		String s7="welcome";
		String s8="welcome";
		System.out.println(s7.equals(s8));

		//equalsIgnoreCase():ignore upper and lower case sensitivity

		String s9="welcome";
		String s10="WelCome";
		System.out.println(s9.equalsIgnoreCase(s10));

		//replace():replace single or multiple character		
		String s11="welcome to selenium java selenium paython selenium c#";
		System.out.println(s11.replace("s", "O"));
		System.out.println(s11.replace("java", "Paython"));

		//substring: its consider starting and ending index
		String s12="this is my java selenium program";
		System.out.println(s12.substring(0, 9));   //starting index 0=t and ending index 9=m;


		//toUpperCase() & toLowerCase(): convert upper case letter to lower case latter and lower tp upper
		String s13="automation Testing By Using Selenium Tools";
		System.out.println(s13.toUpperCase());
		System.out.println(s13.toLowerCase());


		//split(): split the string into multiple part based on delimiter
		String s14="abcd@gmail.com";
		String a[]=s14.split("@");	
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);  //abcd
		System.out.println(a[1]);  //@gmail.com


	}

}

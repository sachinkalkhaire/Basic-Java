package Day9;

public class stringBufferVsStringBuilder4 {

	public static void main(String[] args) {

		//String-immutable	

		String s="welcome";
		s.concat("to java");
		System.out.println(s);		//welcome// immutable -we can not change original value

		//StringBuffer-mutable

		StringBuffer sb=new StringBuffer("welcome");
		sb.append(" to java");
		System.out.println(sb);	   //welcome to java//  mutable- we can change original values

		//StringBuilder-mutable
		StringBuilder sb1=new StringBuilder("welcome");
		sb1.append(" to java");
		System.out.println(sb1);    //welcome to java//  mutable- we can change original values
		
		
		
		

	}

}

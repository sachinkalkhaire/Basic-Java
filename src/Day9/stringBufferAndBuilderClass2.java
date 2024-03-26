package Day9;

public class stringBufferAndBuilderClass2 {

	public static void main(String[] args) {

		//String, StringBuffer and StringBuilder:

		//String:immutable object- not change the original values

		//StringBuffer and StringBuilder:mutable object -change original values
		
		//reversed string by using stringBufer Class
		StringBuffer sb=new StringBuffer("welcome");
		
		System.out.println(sb.reverse());
		
		//reversed string by using stringBuilder Class
				StringBuilder sbc=new StringBuilder("welcome");
				
				System.out.println(sbc.reverse());
		
	}

}

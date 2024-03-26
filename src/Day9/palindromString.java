package Day9;

public class palindromString {

	public static void main(String[] args) {
	
		
		String s="MADAM";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(s))
		{
			System.out.println("string is palindrom"+rev);
		}

	}

}

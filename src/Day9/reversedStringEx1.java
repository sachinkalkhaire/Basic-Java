package Day9;

public class reversedStringEx1 {

	public static void main(String[] args) {
		
		//Approach1-using length(),charAt();
		String s="welcome";
		String rev= " ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
		
		//Approach2: without using string methods
		
		String s1="welcome";
		String revr="";
		char a[]=s1.toCharArray();
		for(int i=s1.length()-1;i>=0;i--)
		{
			revr=revr+a[i];
		}
		System.out.println(revr);
	}

}

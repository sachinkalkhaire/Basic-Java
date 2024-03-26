package Day7;

public class ArrayElementInReversedOrder5 {

	public static void main(String[] args) {
		//print array element in reversed order
		
		int a[]= {500,400,300,200,100};
		
        //for(int i=0;i<a.length;i++) //for refrance to reversed
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}

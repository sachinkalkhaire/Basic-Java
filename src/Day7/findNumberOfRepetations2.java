package Day7;

public class findNumberOfRepetations2 {

	public static void main(String[] args) {
		//find number of repetations or count duplicate number

		int a[]= {100,200,100,300,100,400};
		int num=100;
		int count=0;

		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}

		}

		System.out.println(count);

	}

}

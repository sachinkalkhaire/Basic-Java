package Day7;

public class SearchElementInArray1 {

	public static void main(String[] args) {

		//search element in array(linear search)
		int a[]= {10,20,30,40,50};
		int searchElement=30;
		boolean status=false;

		for(int i=0; i<a.length;i++)
		{
			if(a[i]==searchElement)
			{
				System.out.println("element found");
				status=true;
				break;
			}

		}

		/*


		  for(int i:a)
		  {
		  if(i==searchElement)
		    {
		      System.out.println("element found");
		      break;
		    }
           }

		 */


		if(status==false)
		{
			System.out.println("element not found");
		}
	}
}

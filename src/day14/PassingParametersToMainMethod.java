package day14;

public class PassingParametersToMainMethod {

	public static void main(String[] args) {

		//how can find number of values in array
		System.out.println(args.length);
		for(String values:args)
		{
			System.out.println(values);	
		}
	}

}

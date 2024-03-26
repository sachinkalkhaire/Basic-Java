package Day9;

import java.util.Arrays;

public class DefferanceBetMutableAndImmutable3 {

	public static void main(String[] args) {

		//Defrence between mutable and immutable

		//mutable-can change original value
		int a[]= {20,10,40,30,50};
		System.out.println(Arrays.toString(a));

		Arrays.sort(a);  //mutable

		System.out.println(Arrays.toString(a));

		//immutable-can not change original value
		String s=new String("welcome");
		System.out.println(s);   //welcome
		String concatstring=s.concat("java methods");
		System.out.println(s);   //welcome.....>immutable-we cant change original values
		System.out.println(concatstring);   //welcome
		
	}

}

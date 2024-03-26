package Day7;

import java.util.Scanner;

public class InputFromUser6 {

	public static void main(String[] args) {
		//data enter user in console window
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		System.out.println("enter 2nd number:");
		int num2=sc.nextInt();
		
		int num3=num1+num2;
		System.out.println(num3);
		
		
	}

}

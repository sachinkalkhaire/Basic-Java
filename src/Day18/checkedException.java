package Day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class checkedException {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start program");

		Thread.sleep(200); //InterruptedException

		try 
		{
			FileInputStream file =new FileInputStream("C:\\Users\\Shree\\Desktop\\Resume friend"); //FileNotFoundException
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}


		System.out.println("program exit");

	}

}

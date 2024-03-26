package Day15;

//Overriding: child class method defination should be same only body will be different this is called as overriding.
//overriding achieved by using inheritance..its used to perform single action on different ways achieved by runtime Polymorphism
//objective: 1.code re-usability, 2. avoid duplications, 3.reduce cod and dev. time.,4.save memory.

class Bank{
	
	double getRateOfInterest()
	{
		return 0.0;
	}
}

class HDFC extends Bank{
	
	double getRateOfInterest()
	{
		return 8.9;
	}
}
class PDCC extends Bank{
	
	double getRateOfInterest()
	{
		return 7.5;
	}
}

class BOI extends Bank{
	
	double getRateOfInterest()
	{
		return 6.8;
	}
}
public class Overriding1 {

	public static void main(String[] args) {
		HDFC hdfc=new HDFC();
		System.out.println(hdfc.getRateOfInterest());
		
		PDCC pdcc=new PDCC();
		System.out.println(pdcc.getRateOfInterest());
		
		BOI boi=new BOI();
		System.out.println(boi.getRateOfInterest());

	}

}

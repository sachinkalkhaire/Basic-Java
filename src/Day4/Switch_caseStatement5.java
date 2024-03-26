package Day4;

public class Switch_caseStatement5 {

	public static void main(String[] args) {
		//exaple 1
		int day=7;
		
		switch(day)
		{
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("tuesday"); break;
		case 3: System.out.println("wdnesday"); break;
		case 4: System.out.println("thursday"); break;
		case 5: System.out.println("friday"); break;
		case 6: System.out.println("satarday"); break;
		case 7: System.out.println("sunday"); break;
		default: System.out.println("no weekDay"); break;
		
		}
		
		//exaple 2
String weekName="wednesday";
switch(weekName)
{
case "monday": System.out.println(1);break;
case "tuesday": System.out.println(2);break;
case "wednesday": System.out.println(3);break;
case "thursday": System.out.println(4);break;
case "friday": System.out.println(5);break;
case "saturday": System.out.println(6);break;
case "sunday": System.out.println(7);break;
default: System.out.println("no week name"+0);break;

}



	}

}

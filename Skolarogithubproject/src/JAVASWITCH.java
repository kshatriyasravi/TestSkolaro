import java.util.Scanner;
public class JAVASWITCH {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the week number:");
		int week=input.nextInt();
		String day=null;
		switch (week)
		{
		case 1:
			day="monday";
			break;
		case 2:
			day="tuesday";
			break;
		case 3:
			day="wedsday";
			break;
		case 4:
			day="thusday";
			break;
		case 5:
			day="friday";
			break;
		case 6:
			day="satuday";
			break;
		case 7:
		day="sunday";
			break;
		}
		System.out.println("You have entered the week number as:\n"+week +day);
		
		
	}
}	

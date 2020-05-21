import java.util.Scanner;
public class ex321052020d
{
	public static void main(String[] args)
	{
		
		{
			inko i=new inko();
			i.inkoko();
			
			int x,y,temp;
			Scanner Sc=new Scanner (System.in);
			System.out.println("welcome to Swap Program.. Please enter the x and y values");
			x=Sc.nextInt();
			y=Sc.nextInt();
			System.out.println("print befor swapping the x and y values is:"+x +"&"+y);
			temp=x;
			x=y;
			y=temp;
			System.out.println("After Swapping:"+x+y);
			
			
		}
	}

}
class inko
{
	public void inkoko()
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("this is a 2 variable swap, so welcome and enter the x and y value:");
		x=sc.nextInt();
		y=sc.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Print reverse values:"+x+"**"+y);
		
	}
}

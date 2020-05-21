import java.util.Scanner;
import java.util.*;
import java.io.*;

public class ex2
{
	public static void main(String[] args)
	{
		method1 m=new method1();
		m.method1();
		
		method2 m1= new method2();
		m1.inkkomethod();
		
		meathod3 m2=new meathod3();
		m2.method3();
		
	}

}
class method1
{
	public void method1()
	{
		String Location="Bangarupalyam Chittoor District";
		StringBuilder S=new StringBuilder();
		S.append(Location);
		S=S.reverse();
		System.out.println("this is inside fucntion revere:"+S);
	}
}
class method2
{
	public void inkkomethod()
	{
		String Address="two-125 otkStreet bangarupalyam";
		char change[]=Address.toCharArray();
		
		for(int i=change.length-1;i>=0;i--)
		{
			System.out.println(change[i]);
		}
	}
}
class meathod3
{
	public void method3()
	{
		String str;
		Scanner Sc=new Scanner(System.in);
		System.out.println("please enter the revere value");
		str=Sc.nextLine();
		String ekkadanunchitesuko[]=str.split("");
		for(int i=ekkadanunchitesuko.length-1;i>=0;i--)
		{
			System.out.println(ekkadanunchitesuko[i]);
		}
	}
}
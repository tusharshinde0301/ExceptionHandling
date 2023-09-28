package exceptionhand;

import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		 int b=0;   //ArithmeticException
		
		System.out.println("Before code");
		int c=a/b;
		System.out.println(c);
		System.out.println("After code");*/
		
		/*int a[]= {2,3,4};
		System.out.println(a[10]);   */ //ArrayIndexOutofBound Exception
		
		/*String s=null;
		//String s="Tushar";
		System.out.println(s.length());*/   //NullPointerException
		
		/*int a=10;
		int b=0;
		System.out.println("Before code");
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(NullPointerException e)
		{
			System.out.println("Denominatore cannot be zero");
		}
		finally
		{
			System.out.println("final code");
		}
		System.out.println("After");*/
		
		
	/*	int a=20;
		int b=2;
		int m[]= {10,20,30};
		String name=null;
		try
		{
			System.out.println(m[2]);
			System.out.println(a/b);
			System.out.println(name.length());
			System.out.println(m[0]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("deno can not be 0");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("no string");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		*/
		
		/*int a=-10;
		try
		{
			if(a>=0)
			{
				System.out.println(a);
			}
			else
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("pls enter positive number");
		}
		*/
		
		int age;
		Scanner S=new Scanner (System.in);
		System.out.println("Enter age");
		age=S.nextInt();
		
		try
		{
			if(age>=18)
			{
				System.out.println("Eligible for voting");
			}
			else
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not eligible for voting");
		}
		
}

}

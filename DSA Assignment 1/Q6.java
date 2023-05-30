/*Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
method can't use the multiplication, modulus, or division operators, The method signature is
as follows.
public static boolean isOdd(int n)*/

import java.util.*;
public class Q6
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		boolean iflo = isOdd(n);
		
		if(iflo==true)
			System.out.println(n+" is an Odd Number.");
		else
			System.out.println(n+" is an Even Number.");
		
		sc.close();

	}
	
	public static boolean isOdd(int n)
	{
		
		if((n&1)==0)
			return false;
		else 
			return true;
		
	}

}

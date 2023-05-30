/* Write a Java program that takes as input three integers, a, b, and c, from the Java console
and determines if they can be used in a correct arithmetic formula (in the given order), like 
“a + b = c,” “a = b − c,” or “a*b = c.” */ 

import java.util.*;

class HW1
{
	public static void main(String[] args)
	{

	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Integer : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd Integer : ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd Integer : ");
		int c = sc.nextInt();

		if( a+b==c && b-c ==a && a*b==c )
			System.out.println("The numbers can be used in a correct Arithmetic Formula.");
		else
			System.out.println("The numbers can't be used in correct Arithmetic Formula.");

        sc.close();
	}
}

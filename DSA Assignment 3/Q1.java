/*Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler.*/

import java.util.*;

class Q1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your lucky number: ");
		int lucky = sc.nextInt();
		
		if(lucky<0)
			throw new NumberFormatException("Bruh? Negative? '_'");
		else
			System.out.println("Wow!! Your lucky number is "+lucky+"?? Damn!!! XD");
		
		sc.close();
	}

}

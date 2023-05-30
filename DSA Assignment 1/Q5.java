import java.util.Scanner;

/*Write a java method to calculate the sum of digits of a given number until the number is a
single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)
Example:
 Let n = 9294
 Sum = 9 + 2 + 9 + 4 = 24
 Sum = 2 + 4 = 6*/

public class Q5
{
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int N = sum_Of_Digits(n);
		System.out.print("Sum of digits of "+n+" until the number is a single digit is "+N+".");
		
		sc.close();
		
	}
	
	public static int sum_Of_Digits(int n)
	{
		
		int sum = 0;
		
		while(n!=0)
		{
			int temp = n%10;
			sum += temp;
			n /= 10;
		}
		
		while(sum>=10)
			sum=sum_Of_Digits(sum);
		
		return sum;
		
	}

}

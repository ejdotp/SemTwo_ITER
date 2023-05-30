/*Write a java program to check whether a number is a spy number or not. 
N = 132
Sum of digit of N = 1 + 3 + 2 = 6
Product of digit of N = 1 × 3 × 2 = 6
So, 132 is a spy number.*/
import java.util.*;
public class Q3
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N = sc.nextInt();
		
		int sum = 0, prod = 1;
		int n = N;
		while(n!=0)
		{
			int temp = n%10;
			sum += temp;
			prod *= temp;
			n /= 10;
		}
		
		if (sum==prod)
			System.out.println(N+" is a spy number.");
		else
			System.out.println(N+" is not a spy number.");
		sc.close();
		
	}

}

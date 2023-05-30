/*
Write a Java program that can take a positive integer greater than 2 as input and write out the number of times 
one must repeatedly divide this number by 2 before getting a value less than 2.
*/
public class Q1 
{

	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		System.out.println("The positive integer greater than 2 from command line argument\n"
				+ "is "+a+".");
		int count=0;
		
		if(a>2)
		{
			while(a>2)
			{
				count++;
				a=a/2;
			}
			System.out.println("The number of times one must repeatedly divide this number by 2 before "
					+ "getting a value less than 2 is "+count+".");		
		}
		else
		{
			System.out.println("Invalid Entry!");
		}
	}

}

























//https://github.com/Ansu12chiku/DSA_Assignment_01
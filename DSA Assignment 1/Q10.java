/*Write a method that returns the sum of all the elements in a specified column in a matrix
using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a java program that reads a 3-by-4 matrix and displays the sum of each column*/

import java.util.*;

public class Q10
{

	public static double sumColumn(double[][] m, int columnIndex)
	{
		double SUM = 0;
		for(int i = 0; i < m.length; i++)
		{
			SUM += m[i][columnIndex];
		}
		return SUM;
	}
	
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		
		//Initialization:
		double Arr[][] = new double[3][4];
		
		//Entering Elements:
		System.out.println("Enter a 3-by-4 matrix row by row:");
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				Arr[i][j] = sc.nextDouble();
			}
		}
		
		//Printing column sums:
		int i=0;
		while(i<4)
		{
			System.out.println("Sum of the elements at column "+i+" is "+sumColumn(Arr, i));
			i++;
		}

		sc.close();
		
	}

}

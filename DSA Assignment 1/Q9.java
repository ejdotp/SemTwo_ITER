/*Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:

public static double sumMajorDiagonal(double[][] m)

Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
major diagonal. */

import java.util.*;
public class Q9
{
	
	public static double sumMajorDiagonal(double[][] m)
	{
		double SUM = 0;
		for(int i = 0; i < 4; i++)
		{
			SUM += m[i][i];
		}
		return SUM;
	}

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		//Initialization:
		double Arr[][] = new double[4][4];
		
		//Entering Elements:
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				Arr[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(Arr)+".");

		sc.close();
		
	}

}

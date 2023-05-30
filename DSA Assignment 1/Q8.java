/*Write a java program to print M-by-N array in the tabular format. Also, display the sum of
elements of the array.*/

import java.util.*;
public class Q8
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		//Initialization:
		System.out.print("Enter number of Row and Columns of 2D-Array: ");
		int R = sc.nextInt();
		int C = sc.nextInt();
		int Arr[][] = new int[R][C];
		
		//Entering Elements:
		System.out.print("Enter elements of 2D-Array: ");
		for(int i = 0; i < R; i++)
		{
			for(int j = 0; j < C; j++)
			{
				Arr[i][j] = sc.nextInt();
			}
		}
		
		//Displaying & Adding Elements:
		int SUM = 0;
		System.out.println("The elements of 2D array are: ");
		for(int i = 0; i < R; i++)
		{
			for(int j = 0; j < C; j++)
			{
				SUM += Arr[i][j];
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The sum of elements of the 2D-Array is "+SUM+".");
		
		sc.close();
		
	}

}

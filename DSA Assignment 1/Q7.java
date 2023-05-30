/*Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.*/
import java.util.*;
public class Q7 {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements of Array: ");
		int ArS = sc.nextInt();
		int Arr[] = new int[ArS];
		
		System.out.print("Enter elements of the array: ");
		for(int i = 0; i < ArS; i++)
		{
			Arr[i] = sc.nextInt();
		}
		
		//Finding & Counting the Maximum
		int FO = 0;
		int max = Arr[0];
		for(int i = ArS-1; i >= 0; i--)
		{
			if(max <= Arr[i])
			{
				max = Arr[i];
				FO = i;
			}
		}
		int c1 = count(max, Arr);
		System.out.println("Maximum element of Array is "+max+" and occurs "+c1+" times.");
		
		//Finding & Counting the Minimum
		int min = Arr[0];
		int LO = 0;
		for(int i = 1; i < ArS; i++)
		{
			if(min >= Arr[i])
			{
				min = Arr[i];
				LO = i;
			}	
		}
		int c2 = count(min, Arr);
		System.out.println("Minimum element of Array is "+min+" and occurs "+c2+" times.");
		
		//print occurrence:
		System.out.println("First occurrence of maximum element is at position "+(FO+1)+".");
		System.out.println("Last occurrence of minimum element is at position "+(LO+1)+".");
		
		sc.close();
	}
	
	public static int count(int N, int Arr[])
	{
		int c = 0;
		for(int i=0; i<Arr.length; i++)
		{
			if(Arr[i]==N)
				c++;
		}
		return c;
	}

}

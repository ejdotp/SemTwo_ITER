/*Write a Java program that takes two arrays a and b of length n storing int values, 
and returns the dot product of a and b. That is, it returns an array c of length n such that
c[i] = a[i] · b[i], for i = 0, . . . , n − 1. */

import java.util.*;

class HW3
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the length of the array: ");
		int n = sc.nextInt();
		int A[]=new int[n];
        int B[]=new int[n];
        int C[]=new int[n];

		System.out.print("Enter elements of array A: ");
		for (int i=0;i<n;i++)
		    A[i]=sc.nextInt();

        System.out.print("Enter elements of array B: ");
        for (int j=0;j<n;j++)
            B[j]=sc.nextInt();

		System.out.println("Array C of having dot product is: ");
		for (int k=0;k<n;k++)
		{
            C[k]=A[k]*B[k];
		    System.out.print(C[k]+" ");	
		}

		sc.close();		
		
	}

}

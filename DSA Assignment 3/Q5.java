/*Write a java method using Generics to count the occurrence of an element in an array of any 
type. The signature of count method is given below. 
 
public static <T> int count(T[] array, T item) */

import java.util.*;

public class Q5 
{
    public static <T> int count(T[] array,T item)
    {
        int count =0;

        for(int i=0;i<array.length;i++)
            if (array[i].equals(item)) // equals() method istead of array[i]==k bcz 
                                       // incase it will String type then it will show error
                count++;
        
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Integer arr[]=new Integer[5];

        System.out.println("Enter array elements ");
        for(int i=0;i<arr.length;i++)
             arr[i]=sc.nextInt();

        System.out.println("Enter the element to search ");
        int k=sc.nextInt();

        int c=count(arr, k);
        System.out.println("Number of times "+k+" present in the array is "+c);
        
        sc.close();
    }
    
}

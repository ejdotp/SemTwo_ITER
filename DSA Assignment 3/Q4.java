/*Write  a  java  program  to  print  an  array  of  different  type  using  a  single  Generic  method.  The 
signature of printArray method is given below. 
 
public static < E > void printArray( E[] inputArray) */

import java.util.*;

public class Q4
{  
    public static <E> void printArray(E[] inputArray) 
    {
        for (int i=0;i<inputArray.length;i++) 
             System.out.print(inputArray[i] + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements:");
        Integer[] intarr = new Integer[5];
        for (int i = 0; i < 5; i++) 
            intarr[i] = sc.nextInt();

        System.out.print("Integer Array contains:\n");
        printArray(intarr);

        System.out.println("Enter array elements:");
        Double[] douarr = new Double[5];
        for (int i = 0; i < 5; i++) 
             douarr[i] = sc.nextDouble();
        System.out.print("Double Array contains:\n");
        printArray(douarr); 

        sc.close();
    }
}

/*Write  a  recursive  method  in Java  which,  given  an  integer  n,  print  it  with its  digits  reversed. 
For example, given 4735, it prints 5374 */

import java.util.Scanner;

public class Q8
{    
    static int ans=0;

    public static void reverseNumber(int num) 
    {
        if (num < 10)
        {
            System.out.print(num);
            return;
        }
        else 
            System.out.print(num%10);
        reverseNumber(num/10);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to reverse: ");
        int n = sc.nextInt(); 
        System.out.print("The reverse of the given number is: ");
        reverseNumber(n);
        sc.close();
    }
       
}
//                     or you can use method
//         public static int reverseNumber(int num) 
//         {
//             if (num==0)
//                return ans;
//             else
//             {
//                 int r=num%10;
//                 ans=ans*10 +r;
//                return reverseNumber(num/10);
//             }
//             return ans;
//         }
// }
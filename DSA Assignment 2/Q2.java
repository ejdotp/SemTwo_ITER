/*Define a class called Complex with instance variables real, imag and instance methods
setData(), display(), add(). Write a Java program to add two complex numbers.
The prototype of add method is:
public Complex add(Complex, Complex).*/

import java.util.*;

class Complex 
{
	
    int real;
    int imag;
    
    void setData(int r, int i) 
    { 	
        real = r;
        imag = i;
    }
    
    void display() 
    {
        System.out.print(real+" + i"+imag);
    }
    
    public Complex add(Complex c1, Complex c2)
    {
    	Complex sum = new Complex();
        sum.real = c1.real + c2.real;
        sum.imag = c1.imag + c2.imag;
        return sum;
    }
    
}

public class Q2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int r, i;
		
		System.out.print("Enter real & imaginary part of the 1st complex number with a space in between: ");
		r = sc.nextInt();
		i = sc.nextInt();
		
		Complex c1 = new Complex();
		c1.setData(r, i);
		System.out.print("The Complex Number is: ");
		c1.display();
		System.out.println();
		
		System.out.print("\nEnter real & imaginary part of the 2nd complex number with a space in between: ");
		r = sc.nextInt();
		i = sc.nextInt();
		
		Complex c2 = new Complex();
		c2.setData(r, i);
		System.out.print("The Complex Number is: ");
		c2.display();
		System.out.println();
		
		
		System.out.print("\nSum of Both Complex Numbers is: ");
		Complex c3 = c1.add(c1, c2);
		c3.display();
		
		sc.close();
		
	}

}

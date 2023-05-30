package Q10;

import Sports.sporty;
import java.util.*;

class Test
{
	double Mark1;
	double Mark2;
	
	public void input(double m1, double m2)
	{
		Mark1 = m1;
		Mark2 = m2;
	}
	
	public void output()
	{
		System.out.println("Mark 1 = "+Mark1+"\nMark 2 = "+Mark2);
	}

}

class Student
{

	String name;
	int roll;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name and Roll:");
		String n = sc.next();
		int r = sc.nextInt();
		name = n;
		roll = r;
	}
	
	public void output()
	{
		System.out.println("The student with Roll no. "+roll+" is: "+name);
	}

}

public class Q10 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		st.input();
		st.output();
		
		System.out.println("Enter Mark 1 and marks 2");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		
		Test one = new Test();
		
		one.input(m1, m2);
		one.output();

		System.out.println("Enter score 1 and score 2: ");
		
		double Grandtotal = one.Mark1 + one.Mark2 + sporty.s1 + sporty.s2;
		
		System.out.println("The grand total is: "+Grandtotal);
		
	}

}

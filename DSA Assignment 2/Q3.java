/*Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class
consists of instance methods getdata( ), showdata( ) to provide input to the instance variable
and to display the value of instance variable. Write a program to create the details of 5 students.
Display the information of the students who has secured the highest DSA_Mark.*/

import java.util.*;

class Student 
{
	
    int Roll;
    String Name;
    int DSA_Mark;
    
    void getdata(int r,String n,int m) 
    { 	
    	Roll = r;
    	Name = n;
    	DSA_Mark = m;     
    }
    
    void showdata() 
    {
        System.out.println("Student "+Name+", bearing Roll no. "+Roll+" has secured "+DSA_Mark+" Marks.");
    }
    
}

public class Q3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[5];
		int r, m;
		String n;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Roll, Name & Marks of student "+(i+1)+":");
			r = sc.nextInt();
			n = sc.next();
			m = sc.nextInt();
			s[i]=new Student();
			s[i].getdata(r, n, m);
		}
		System.out.println();
		for(int i=0;i<5;i++)
		{
			s[i].showdata();
		}
		int max = s[0].DSA_Mark;
		int maxindex = 0;
		for(int i=1; i<5; i++)
		{
			if(s[i].DSA_Mark > max) {
				max = s[i].DSA_Mark;
				maxindex = i;
			}
		}
		System.out.println("\nHighest marks is bagged by:");
		s[maxindex].showdata();
		
		sc.close();
	

	}

}

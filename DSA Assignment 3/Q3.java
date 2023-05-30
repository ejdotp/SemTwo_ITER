/*Create a class Student having two instance variable name and mark. Enter mark, name of the
student. If mark is more than 100, create exception MarksOutOfBoundException & throw it
using Java. Display the customised message Mark can’t be greater than 100 for the exception.*/

import java.util.*;

class MarksOutOfBoundException extends RuntimeException
{
	MarksOutOfBoundException(String S)
	{
		super(S);
	}
}

class Q3 //just name the file student here for class student
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name followed by Mark: ");
		String name = sc.next();
		int mark = sc.nextInt();
		
		if(mark>100)
			throw new MarksOutOfBoundException("Bakaero! Mark can't be greater than 100!!");
		else
			System.out.println("The Name is "+name+" & the Mark is "+mark+".");

	}

}

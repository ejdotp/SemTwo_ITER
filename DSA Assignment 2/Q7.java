/*Define a base class Person with instance variable name, age. The instance variables are
initialized through constructors. The prototype of constructor is as below.
Person (string, int)
Define a derived class Employee with instance variables Eid, salary. The instance variables
are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double). Another instance method of Employee class is empDisplay()
to display the information of employee details.*/

class Person
{
	String name;
	int age;
	Person(){
		
	}
	Person(String n, int a)
	{
		name = n;
		age = a;
	}
}

class Employee extends Person
{
	int Eid;
	double salary;
	Employee (String n, int a, int e, double s)
	{
		name = n;
		age = a;
		Eid = e;
		salary = s;
	}
	void empDisplay(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Employee ID: "+Eid);
		System.out.println("Salary: Rs."+salary);
		System.out.println();
	}
}

public class Q7
{

	public static void main(String[] args)
	{
		
		Employee e1 = new Employee("Isagi", 19, 21, 1500000);
		Employee e2 = new Employee("Nagi", 18, 32, 2100000);
		Employee e3 = new Employee("Bachira", 20, 17, 3200000);
		e1.empDisplay();
		e2.empDisplay();
		e3.empDisplay();

	}

}

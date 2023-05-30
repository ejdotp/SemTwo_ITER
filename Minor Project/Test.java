package <package_name>;

import java.util.*;

public class Test 
{
	
	public static void arrangeEmployeeBySalary(Employee e[])
	{
		Arrays.sort(e, (a, b) -> 
        {
            if (a.salary > b.salary) 
                return -1;
            else if (a.salary < b.salary) 
                return 1;
            else
                return 0;
            
        });
		System.out.println("----> Employee details in descending order of Salary:");
		for(int i=0;i<e.length;i++)
		{
			e[i].display();
		}
		System.out.println();
	}

	public static void getEmployeesByJobPosition(Employee e[],String jp)
	{
		System.out.println("----> Employees having job position "+jp+" are:");
		for(int i=0;i<e.length;i++)
		{
			if(jp.equalsIgnoreCase(e[i].jobPosition))
				e[i].display();
		}
		System.out.println();
	}

	public static void getEmployeesByHireDate(Employee e[],Date d1,Date d2)
	{
		System.out.println("----> Employees hired between "+d1.day+"/"+d1.month+"/"+d1.year+" and "+d2.day+"/"+d2.month+"/"+d2.year+" are:");
		for(int i=0;i<e.length;i++)
		{
			if(e[i].hireDate.year==d1.year && e[i].hireDate.month>=d1.month && e[i].hireDate.day>=d1.day)
				e[i].display();
			else if(e[i].hireDate.year>d1.year && e[i].hireDate.year<d2.year)
				e[i].display();
			else if(e[i].hireDate.year==d2.year && e[i].hireDate.month<=d2.month && e[i].hireDate.day<=d2.day)
				e[i].display();
		}
		System.out.println();
	}

	public static int foreignEmployeeCount(Employee e[])
	{
		int c=0;
		for(int i=0;i<e.length;i++)
		{
			if(!(e[i].contactNumber.substring(0, 3).equals("+91")))
                c++;
            
				
		}
		return c;
	}

	public static void getEmployeesBySalary(Employee e[],double s1,double s2)
	{
		System.out.println("----> Employees having salary between Rs. "+s1+" and Rs."+s2+"are:");
		for(int i=0;i<e.length;i++)
		{
			if(e[i].salary>=s1 && e[i].salary<=s2)
				e[i].display();
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Employee employees[]=new Employee[20];

		employees[0] = new Employee("Peter", 1, 185000, new Date(10,05,2004), "Developer", "+91 7008512321", new Address("BBSR", "India", 751030));
        employees[1] = new Employee("Astha", 2, 175000, new Date(12,06,2005), "Tech Engineer", "+01 7008512322", new Address("New York", "USA", 100102));
        employees[2] = new Employee("Robert", 3, 165000, new Date(01,07,2006), "Manager", "+01 7008512323", new Address("New York", "USA", 100102));
        employees[3] = new Employee("Ana", 4, 155000, new Date(15,07,2007), "Chief Advisor", "+91 7008512324", new Address("Hyderabad", "India", 445030));
        employees[4] = new Employee("Tony", 5, 145000, new Date(01,06,2008), "HR", "+91 7008512325", new Address("BBSR", "India", 751003));
        employees[5] = new Employee("Marinda", 6, 135000, new Date(15,10,2009), "Manager", "+91 7008512326", new Address("Hyderabad", "USA", 444000));
        employees[6] = new Employee("Amber", 7, 125000, new Date(01,11,2010), "Intern", "+91 7008512327", new Address("Delhi", "India", 205222));
        employees[7] = new Employee("Chris", 8, 115000, new Date(15,12,2011), "Designer", "+91 7008512328", new Address("BBSR", "India", 751007));
        employees[8] = new Employee("Natalie", 9, 105000, new Date(01,01,2012), "Data Scientist", "+01 7008512329", new Address("Delhi", "India", 205562));
        employees[9] = new Employee("Jagadeesh", 10, 95000, new Date(15,02,2013), "Caterer", "+91 7008512330", new Address("Hyderabad", "India", 445200));
        employees[10] = new Employee("Arman", 11, 85000, new Date(01,03,2023), "Finance Officer", "+01 7008512331", new Address("New York", "USA", 100204));
        employees[11] = new Employee("Subham", 12, 75000, new Date(15,04,2015), "Head of Accounts", "+01 7008512332", new Address("New York", "USA", 100205));
        employees[12] = new Employee("Haridwar", 13, 150000, new Date(01,01,2023), "Manager", "+01 7008512330", new Address("Washington", "USA", 100205));
        employees[13] = new Employee("Tenzing", 14, 550000, new Date(15,06,2016), "Director", "+01 7008512333", new Address("Washington", "USA", 100205));
        employees[14] = new Employee("Louis", 15, 450000, new Date(01,07,2017), "Professor", "+01 7008512334", new Address("Washington", "USA", 100206));
        employees[15] = new Employee("Brian", 16, 350000, new Date(15,11,2022), "Manager", "+01 7008512335", new Address("Washington", "USA", 100103));
        employees[16] = new Employee("Stephanie", 17, 250000, new Date(01,12,2019), "Paid Inter", "+01 7008512336", new Address("Phoenix", "USA", 100207));
        employees[17] = new Employee("Roza", 18, 130000, new Date(15,10,2020), "UI/UX Designer", "+91 7008512337", new Address("Delhi", "India", 235500));
        employees[18] = new Employee("Jake", 19, 500000, new Date(01,11,2021), "Backend Developer", "+01 7008512338", new Address("Phoenix", "USA", 100205));
        employees[19] = new Employee("Harry", 20, 120000, new Date(15,12,2022), "Frontend Developer", "+01 7008512339", new Address("Phoenix", "USA", 100208));

		arrangeEmployeeBySalary(employees);

		getEmployeesByJobPosition(employees,"Manager");

		getEmployeesByHireDate(employees,new Date(1,4,2022),new Date(31,3,2023));
		
		System.out.println("----> Number of foreign employees are: "+foreignEmployeeCount(employees));
		System.out.println();

		getEmployeesBySalary(employees,150000,300000);
	}

}

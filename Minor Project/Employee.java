package <package_name>;

public class Employee 
{
	String name;
	int empId;
	double salary;
	Date hireDate;
	String jobPosition;
	String contactNumber;
	Address address;

	Employee()
	{
		
	}

	Employee(String name,int empId,double salary,Date hireDate,String jobPosition,String contactNumber,Address address)
	{
		this.name=name;
		this.empId=empId;
		this.salary=salary;
		this.hireDate=hireDate;
		this.jobPosition=jobPosition;
		this.contactNumber=contactNumber;
		this.address=address;		
	}

	void display()
	{
		System.out.println("Employee name: "+name);
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee salary: Rs."+salary);
		System.out.println("Date hired: "+hireDate.day+"-"+hireDate.month+"-"+hireDate.year);
		System.out.println("Job position: "+jobPosition);
		System.out.println("Employee contact no: "+contactNumber);
		System.out.println("Employee address: "+address.city+", "+address.country+", "+address.pincode);
		System.out.println();
	}
}
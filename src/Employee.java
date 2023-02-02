public class Employee extends Person{
	String emp_id;
	int salary;
	Department dept;
	// Default constructor of Employee
	Employee()
	{
		System.out.println("Default constructor of employee...");
	}
	Employee(String name,byte age,String contact,Address address, String emp_id,int salary,Department dept)
	{
		super(name,age,contact,address);
		this.emp_id=emp_id;
		this.salary=salary;
		this.dept=dept;
	}
	// Display the instance variable of Employee class
	public void displayemp()
	{
		display();
		System.out.println("employee id : "+emp_id);
		System.out.println("salary : "+salary);
		System.out.println("department id : "+dept.d_id);
		System.out.println("department name: "+dept.dname);
		System.out.println("department function: "+dept.dfunction);
	}

}

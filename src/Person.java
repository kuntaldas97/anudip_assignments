public class Person {
	String name;
	byte age;
	String contact;
	Address address;
	//default constructor of person
	Person()
	{
		System.out.println("Default constructor of person...");
	}
	Person(String name,byte age,String contact,Address address )
	{
		this.name=name;
		this.age=age;
		this.contact=contact;
		this.address=address;
	}
	// Display the instance var of person class
	public void display()
	{
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("contact : "+contact);
		System.out.println("house no. : "+address.hno);
		System.out.println("area : "+address.area);
		System.out.println("city. : "+address.city);
		System.out.println("state : "+address.state);
		System.out.println("pin : "+address.pin);
	}

}


public class Department {

	//instance variable
	String d_id;
	String dname;
	String dfunction;
	//Default constructor
	Department()
	{
		d_id=" ";
		dname=" ";
		dfunction=" ";
	}
	//parameterized constructor
	Department(String d_id,String dname,String dfunction)
	{
		this.d_id=d_id;
		this.dname=dname;
		this.dfunction=dfunction;
	}

}


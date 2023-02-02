public class Address {
	String hno;
	String area;
	String city;
	String state;
	String pin;
	// Default constructor
	Address()
	{
		hno=" ";
		area=" ";
		city=" ";
		state=" ";
		pin=" ";
	}
	// Parameterized constructor
	Address(String hno,String area,String city,String state,String pin)
	{
		this.hno=hno;
		this.area=area;
		this.city=city;
		this.state=state;
		this.pin=pin;
	}

}

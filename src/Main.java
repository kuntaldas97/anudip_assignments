public class Main {

	public static void main(String[] args) {
		//create the instance of employee class and enter the value
		Address ad=new Address("65","Gochhati","Paschim Medinipur","West Bengal","721148");
		Department d=new Department("ABCD_65","ME","Employee");
		Employee ep=new Employee("Kuntal",(byte)25,"6291147836",ad,"ABC_565",15000,d);
	
		 
		ep.displayemp();

	}

}

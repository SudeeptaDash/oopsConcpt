package oopsConcept;

public class Emp 
{
	int id;
	String name,email;
	Address address;
	
	Emp(int id,String name,String email, Address address)
	{
		this.id =  id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	public void empDetailsDisplay()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(address.city);
		System.out.println(address.state);
		System.out.println(address.zipcode);
	}

	public static void main(String[] args) 
	{
		
		Address add1 = new Address("Gunupur","Odisha",765022);
		Emp emp = new Emp(10,"Sudeepta","Sudeepta@g.com",add1);
		emp.empDetailsDisplay();

	}

}


package oopsConcept;

public class StaticVariableSample {

	public static void main(String[] args) 
	{
		Employee001 e1 = new Employee001(1461577,"Sudeepta Dash");
		e1.emplyeedetailsdisplay();
		

	}

}
class Employee001
{
	int employeeid;
	String employeeName;
	static String companyName = "TATACONSULTANCYSERVICES";
	
	Employee001(int eid, String ename)
	{
		employeeid = eid;
		employeeName = ename;
		
	}
	public void emplyeedetailsdisplay()
	{
		System.out.println(employeeid);
		System.out.println(employeeName);
		System.out.println(companyName);
		
	}
}
	
	


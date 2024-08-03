package oopsConcept;

public class ObjectInitializationByMethodEmployee 
{

	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.insertValue(1461, "Sudeepta", 78000.00);
		e.displayInformation(1461, "Sudeepta", 78000.00);
		Employee e1 = new Employee();
		e1.insertValue(1462, "Harshita", 68000.00);
		e1.displayInformation(1462, "Harshita", 68000.00);

	}

}
class Employee
{
	int eid;
	String ename;
	double salary;
	
	public void insertValue(int id,String name,double sal)
	{
		eid = id;
		ename = name;
		salary = sal;
	}
	public void displayInformation(int id,String name,double sal)
	{
		System.out.println(name+"-"+id+" having salary : "+sal);
	}

}

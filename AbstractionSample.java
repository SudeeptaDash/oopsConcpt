package oopsConcept;

public class AbstractionSample {

	public static void main(String[] args) 
	{
		furniture f = new DiningTable();  // Parent class object reference for child object
		f.cost();
		f.type();
	}

}
abstract class furniture
{
	furniture()
	{
		System.out.println("furniture class constructor invoked");
	}
	abstract void cost();
	void type()
	{
		System.out.println("Wooden");
	}
	
}
class DiningTable extends furniture
{
	void cost()
	{
		System.out.println("Cost range is 20000k-30000k");
	
	}
	
}

package oopsConcept;

public class Bikeee 
{
	public void run()
	{
		System.out.println("Running.....");
	}

	public static void main(String[] args) 
	
	{
		Bikeee  be = new Splendor();
		be.run();
		
		Bikeee  be1 = new Bikeee();
		be1.run();
		
		Splendor s = new Splendor();
		s.run();
		
		
	}
Splendor s = new Splendor();
}
class Splendor extends Bikeee
{
	public void run()
	{
		System.out.println("Running safely with 100kmph");
	}
	
}

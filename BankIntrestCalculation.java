package oopsConcept;

public class BankIntrestCalculation {

	public static void main(String[] args) 
	{
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println(s.getRateOfInterest());
		System.out.println(i.getRateOfInterest());
		System.out.println(a.getRateOfInterest());
		
		
		
		
	}

}
class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}  
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}  
	
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}  
	
}
class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 6;
	}  
	
}

package oopsConcept;

public class AnanymousObject {

	public static void main(String[] args) 
	{
		
          System.out.println(new Calculation().fact(5));
	}

}
class Calculation
{
	int n = 10;
	public int fact(int n)
	{
		int fact =1;
		for(int i =1;i<=n;i++)
		{
		   fact = fact * i;
		}
		
		return fact;
		
	}
	
}

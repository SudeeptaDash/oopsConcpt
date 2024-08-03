package oopsConcept;

public class InstnceInitialieBlockAndSuper 
{
	InstnceInitialieBlockAndSuper()
	{
		System.out.println("Inside InstnceInitialieBlockAndSuper constructor");
	}
	{
		System.out.println("Instance initializer block - InstnceInitialieBlockAndSuper");
	}
	public static void main(String[] args) 
	{
		Example e1 = new Example();
		
		//InstnceInitialieBlockAndSuper iibas = new InstnceInitialieBlockAndSuper();
	

	}

}
class Example extends InstnceInitialieBlockAndSuper
{
	Example()
	{
		super();
		System.out.println("Inside Example class constructor");
	}
	{
		System.out.println("Instance initializer block - Example");
	}
	
}

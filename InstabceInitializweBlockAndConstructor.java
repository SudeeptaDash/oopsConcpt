package oopsConcept;

public class InstabceInitializweBlockAndConstructor 
{
	boolean invoke;
	
	InstabceInitializweBlockAndConstructor()
	{
		invoke = true;
		System.out.println("Constructore Invoked - "+ invoke);
	}
	{
		invoke = false;
		System.out.println("Constructore Invoked - "+ invoke);
		
	}
	

	public static void main(String[] args) 
	{
		InstabceInitializweBlockAndConstructor iibc = new InstabceInitializweBlockAndConstructor();
		

	}

}

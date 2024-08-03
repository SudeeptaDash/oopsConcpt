package oopsConcept;

public class InstanceInitializeBlock 
{
	int value;
	InstanceInitializeBlock()
	{
		System.out.println("Instance Initialize block invoked -"+ value);
	}
	{
		value = 101;             
	}

	public static void main(String[] args) 
	{
		
		InstanceInitializeBlock iib = new InstanceInitializeBlock();
		InstanceInitializeBlock iib1 = new InstanceInitializeBlock();
		

	}

}

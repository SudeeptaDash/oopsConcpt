package oopsConcept;

public class InvokingConstructorUsingThis {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Test01 t1 = new Test01(2);
		

	}

}
class Test01
{
	Test01()
	{
		System.out.println("Hey!!I am in default Constructor");
	}
	Test01(int no)
	{
		this(); // This invokes the default Constructor
		System.out.println("Hey!!I am in Parameterized Constructor");
	}

}

package oopsConcept;

public class InvokingParameterizedConstructor {

	public static void main(String[] args) 
	{ 
		Test02 t2 = new Test02();
		

	}

}
class Test02
{
	int n;
	
	Test02()
	{
		this(10);
		System.out.println("I am Default one");
		
	}
	Test02(int n)
	{
		System.out.println("I am parameterized Constructor");
	}
		
}
	


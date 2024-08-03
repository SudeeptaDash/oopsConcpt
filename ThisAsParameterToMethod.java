package oopsConcept;

public class ThisAsParameterToMethod {

	public static void main(String[] args) 
	{
		ThisAsParameterToMethod ap = new ThisAsParameterToMethod();
		ap.n();

	}
	
	public void m(ThisAsParameterToMethod obj)
	{
		System.out.println("Method M invoked");
	}
	public void n()
	{
		m(this);
	}


}

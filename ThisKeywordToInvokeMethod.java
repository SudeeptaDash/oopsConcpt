package oopsConcept;

public class ThisKeywordToInvokeMethod {

	public static void main(String[] args) 
	{
		A a = new A();
		a.n();

	}

}
class A
{
	public void m()
	{
		System.out.println("Inside m METHOD");
	}
	public void n()
	{
		m();
		this.m();
	}

}

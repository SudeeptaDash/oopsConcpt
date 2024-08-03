package oopsConcept;

public class MethodOverloading 
{

	public static void main(String[] args) 
	{
		System.out.println(add(2,3));
		System.out.println(add(10,11,20));

	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}

}

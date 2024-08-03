package oopsConcept;

public class OverloadingMethodByDataType {

	public static void main(String[] args) 
	{
		int c =multiply(10,10);
		double d =multiply(11.1,11.1);
		System.out.println(c);
		System.out.println(d);

	}
	public static int multiply(int a,int b)
	{
		return a*b;
	}
	public static double multiply(double a,double b)
	{
		return a*b;
	}

}

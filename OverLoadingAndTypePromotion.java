package oopsConcept;

public class OverLoadingAndTypePromotion 
{

	public static void main(String[] args) 
	{
		OverLoadingAndTypePromotion oltp = new OverLoadingAndTypePromotion();
		oltp.sum(10, 30);
		oltp.sum(10, 20, 30);

	}
	
	public void sum(int a,long b)
	{
		long c = a+b;
		System.out.println(c);
	}
	public void sum (int a,int b,int c)
	{
		int d = a+b+c;
		System.out.println(d);
	}
	

}

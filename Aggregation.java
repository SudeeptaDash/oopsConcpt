package oopsConcept;

public class Aggregation 
{
	 Operation op; //Aggregation
	double pi = 3.14;
	
	public  void area(int radius)
	{
		op = new Operation();
		int square = op.square(radius);
		double area = pi*square;
		System.out.println("The Area calculated as "+area+" metersquare");
		
	}

	public static void main(String[] args) 
	{
		Aggregation a = new Aggregation();
		a.area(10);
	}

}
class Operation
{
	public  int square(int n)
	{
		int sq = n*n;
		return sq;
		
	}
}

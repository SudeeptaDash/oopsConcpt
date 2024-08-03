package oopsConcept;

public class MultipleObjectSameReference {

	public static void main(String[] args) 
	{
		Rectangeles2 r1 = new Rectangeles2();
		r1.insertData(39, 10);
		r1.CalculateArea(39, 10);
		Rectangeles2 r2 = new Rectangeles2();
		r2.insertData(30, 10);
		r2.CalculateArea(30, 10);
		

	}

}
class Rectangeles2
{
	int length;
	int width;
	public void insertData(int l, int w)
	{
		length = l;
		width = w;
	}
	public void CalculateArea(int l, int w)
	{
		int area = l*w;
		System.out.println("Area calculated as :"+area);
		
	}
	
}
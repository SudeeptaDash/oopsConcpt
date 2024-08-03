package oopsConcept;

public class AbstarctClassSample {

	public static void main(String[] args) 
	{
		District d = new Block();
		d.rule();
		
		Block b = new Block();
		b.rule();
		

	}

}
abstract class District
{
	abstract void rule();
}
class Block extends District
{
	void rule()
	{
		System.out.println("Covid Rule - 1");
	}
}

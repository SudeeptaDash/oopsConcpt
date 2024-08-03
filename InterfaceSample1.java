package oopsConcept;

public class InterfaceSample1 {

	public static void main(String[] args) 
	{
		Circle001 c1= new Circle001();
		c1.drawing001();
		
		Reactangle001 r1 = new Reactangle001();
		r1.drawing001();

	}

}
interface Drawable
{
	void drawing001();
}
class Circle001 implements Drawable
{
	public void drawing001()
	{
		System.out.println("Drawing circle by cumpas");
	}
}
class Reactangle001 implements Drawable
{
	public void drawing001()
	{
		System.out.println("Drawing Reactangle by scale");
	}
}
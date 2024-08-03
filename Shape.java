package oopsConcept;

public class Shape 
{
	public void draw()
	{
		System.out.println("Drawing....");
	}

	public static void main(String[] args) 
	{
		
		Shape s ;
		s =	new Reactangle();
		s.draw();
		s = new Square();
		s.draw();
		s = new Triangle();
		s.draw();
		s = new Circle();
		s.draw();
		

	}

}
class Reactangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing a reatangle");
	}
}
class Square extends Shape
{
	public void draw()
	{
		System.out.println("Drawing a Square");
	}
}
class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing a Triangle");
	
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing a Circle");
	}
}

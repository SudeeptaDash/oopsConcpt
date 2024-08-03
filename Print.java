package oopsConcept;

public class Print implements Printable
{
	public void print()
	{
		System.out.println("Hello Printed");
	}

	public static void main(String[] args) 
	{
		Print p = new Print();
		p.print();
	}

}
interface Printable
{
	public void print();
}

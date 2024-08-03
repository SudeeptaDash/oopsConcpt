package oopsConcept;

public class SingleInheritance {

	public static void main(String[] args) 
	{
		Dog2 d = new Dog2();
		d.eat();
		d.barking100();

	}

}
class Animal2
{
	public void eat()
	{
		System.out.println("Eating!!!!");
	}
}
class Dog2 extends Animal2
{
	

	public void barking100() 
	{
		System.out.println("BARKING.....");
		
	}
}

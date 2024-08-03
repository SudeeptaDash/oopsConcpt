package oopsConcept;

public class MultilevelInheritance {

	public static void main(String[] args) 
	{
		Puppy p = new Puppy();
		p.eat();
		p.barking01();
		p.weeping();
		
		Dog111 d1 = new Dog111();
		d1.eat();
		d1.barking01();

	}

}
class Animalzoo
{
	public void eat()
	{
		System.out.println("Eating!!!!");
	}
}
class Dog111 extends Animalzoo
{
	public void barking01()
	{
		System.out.println("BARKING.....");
	}
}
class Puppy extends Dog111
{
	public void weeping()
	{
		System.out.println("Weeping-----");
	}
}

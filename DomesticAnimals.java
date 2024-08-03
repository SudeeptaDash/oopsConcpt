package oopsConcept;

public class DomesticAnimals 
{
	public void eat()
	{
		System.out.println("Eats what their owner gives");
	}

	public static void main(String[] args) 
	{
		DomesticAnimals da,da1,da2;
		Cow c,c1;
		da = new DomesticAnimals();
		da.eat();
		da1 = new Cow();
		da1.eat();
		da2 = new Calf();
		da2.eat();
		c = new Calf();
		c.eat();
		c1 = new Cow();
		c1.eat();

	}

}
class Cow extends DomesticAnimals
{
	public void eat()
	{
		System.out.println("Eats grass");
	}
}
class Calf extends Cow
{
	public void eat()
	{
		System.out.println("Drinks Milk");
	}
}

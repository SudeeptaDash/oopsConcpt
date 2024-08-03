package oopsConcept;

public class HierarchialInheritance 
{

	public static void main(String[] args) 
	{
		Daughter d = new Daughter();
		d.charecter();
		d.nature();
		
		Son s = new Son();
		s.nature();
		s.looks();
		

	}

} 
class Mother
{
	public void nature()
	{
		System.out.println("HardWorking");
	}

}
class Daughter extends Mother
{
	public void charecter()
	{
		System.out.println("As mother");
	}
	
}
class Son extends Mother
{
	public void looks()
	{
		System.out.println("Not good");
	}
}

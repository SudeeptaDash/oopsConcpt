package oopsConcept;

public class ObjectInitialization {

	public static void main(String[] args) 
	{
		studentProperty s1 = new studentProperty();
		s1.id = 100;
		s1.name = "Riki";
		studentProperty s2 = new studentProperty();
		s2.id = 101;
		s2.name = "Niki";
		System.out.println(s1.name +"'s Roll Number  is : "+s1.id);
		System.out.println(s2.name +"'s Roll Number  is : "+s2.id);
	

	}

}
class studentProperty
{
	int id;
	String name;
	
	
}

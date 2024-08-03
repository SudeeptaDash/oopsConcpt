package oopsConcept;

public class DefaultConstructorWithDefaultValue 
{

	public static void main(String[] args) 
	{
		Student2 s2 = new Student2();
		s2.display();
		
	}

}
class Student2
{
	int rollno;
	String name;
	double percentage;
	
	public void display()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(percentage);
	}
}
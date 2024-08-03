package oopsConcept;

public class TestStudent {

	public static void main(String[] args) 
	{
		student s = new student();
		System.out.println(s.rollno);
		System.out.println(s.name);

	}

}
class student 
{
	int rollno;
	String name;
}

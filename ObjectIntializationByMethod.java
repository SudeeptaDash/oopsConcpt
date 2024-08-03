package oopsConcept;

public class ObjectIntializationByMethod {

	public static void main(String[] args) 
	{
		exam ex = new exam();
		ex.insertRecord(98, "Math");
		ex.displayInformation(98, "Math");
		
		exam ex1 = new exam();
		ex1.insertRecord(95, "Science");
		ex1.displayInformation(95, "Science");

	}

}
class exam
{
	int mark;
	String Subject;
	
	public void insertRecord(int m , String s)
	{
		mark=m;
		Subject = s;	
	}
	public void displayInformation(int m , String s)
	{
		System.out.println("He got "+m+" in "+s);
	}
}

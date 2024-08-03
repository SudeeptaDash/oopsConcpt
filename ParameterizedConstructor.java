package oopsConcept;

public class ParameterizedConstructor {

	public static void main(String[] args) 
	{
		room r1 = new room(101,"SinglebedRoom");
		room r2 = new room(102,"DoublebedRoom");
		r1.display();
		r2.display();
		

	}

}
class room
{
	int roomno;
	String roomsize;
	
	room(int rno ,String rsize)
	{
		roomno=rno;
		roomsize=rsize;
		
	}
	public void display()
	{
		System.out.println("The "+roomno+" is "+roomsize);
		
	}
	
}

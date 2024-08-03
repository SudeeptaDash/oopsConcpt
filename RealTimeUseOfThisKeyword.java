package oopsConcept;

public class RealTimeUseOfThisKeyword {

	public static void main(String[] args) 
	{
		CoachingCentre cc = new CoachingCentre(100,"Symboisis","data Science",9000.25);
		cc.display();

	}

}
class CoachingCentre
{
	int regno;
	String name, course;
	double fee;
	
	CoachingCentre(int regno,String name,String course)
	{
		this.regno = regno;
		this.name = name;
		this.course = course;
	}
	CoachingCentre(int regno,String name,String course,double fee)
	{
		this(regno, name, course);
		this.fee = fee;
	}
	public void display()
	{
		System.out.println("Coaching Centre registration number :"+regno);
		System.out.println("Coaching Centre name:"+name);
		System.out.println("Coaching Centre course name :"+course);
		System.out.println("Coaching Centre course fee :"+fee);
	}
	
	
}


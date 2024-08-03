package oopsConcept;

public class ThisKeywordWithAmbiguity {

	public static void main(String[] args) 
	{
		SchoolStudent ss = new SchoolStudent();
		ss.enterValue(101, "Ram", 908.25);
		ss.displaySchoolStudent();
		

	}

}
class SchoolStudent
{
	int rollno;
	String name;
	double fees;
	
	public void enterValue(int rollno,String name,double fees)
	{
		rollno = rollno;
		name = name;
		fees = fees;
	}
	public void displaySchoolStudent()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(fees);
	}
	 //Always jvm will print default value
	 //not able to distinguish between local variable and instance variable
	 // Hence we use this keyword
}

package oopsConcept;

public class ThisKeyword {

	public static void main(String[] args) 
	{
		CollegeStudent cs = new CollegeStudent(14066,"SudeeptaDash",8.01);
		cs.collegeStudentDisplay();

	}

}
class CollegeStudent
{
	int rollno;
	String name;
	double CGPA;
	
	CollegeStudent(int rollno,String name,double CGPA)
	{
		this.rollno = rollno;
		this.name = name;
		this.CGPA = CGPA;
	}
	public void collegeStudentDisplay()
	{
		System.out.println(rollno+" "+name+" "+CGPA);
		
	}
}

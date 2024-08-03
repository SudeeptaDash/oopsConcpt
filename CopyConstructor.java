package oopsConcept;

public class CopyConstructor {

	public static void main(String[] args) 
	{
		
		ExamMark ma = new ExamMark(95,"English");
		ExamMark ma1 = new ExamMark(ma);
		ma.examMarkDisplay();
		ma1.examMarkDisplay();

	}
	

}
class ExamMark
{
	int mark;
	String subject;
	
	ExamMark(int m, String s)
	{
		mark = m;
		subject = s;
	}
	ExamMark(ExamMark ma)
	{
		mark = ma.mark;
		subject = ma.subject;
	}
	public void examMarkDisplay()
	{
		System.out.println(subject+" - "+mark);
	}
}

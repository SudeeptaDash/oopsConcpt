package oopsConcept;

public class CopyValueWithoutConstructor {

	public static void main(String[] args) 
	{
		job j1 = new job("SoftwareEngineer",98000.00);
		job j2 = new job();
		j2.jobName = j1.jobName;
		j2.salary = j1.salary;
		j1.jobDetailsDisplay();
		j2.jobDetailsDisplay();

	}

}
class job
{
	String jobName;
	double salary;
	
	job(String jname,double sal)
	{
		jobName = jname;
		salary = sal;
	}
	job()
	{
		
	}
	public void jobDetailsDisplay()
	{
		System.out.println(jobName);
		System.out.println(salary);
		
	}
	
}

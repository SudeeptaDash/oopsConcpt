package oopsConcept;

public class InhertanceSample {

	public static void main(String[] args) 
	{
		SoftwareEmployee se = new SoftwareEmployee();
		JavaProgrammer jp = new JavaProgrammer();
		jp.salaryCalculation();
		System.out.println("The salary of a softwate employee is :"+se.salary);
		System.out.println("The java programmer gets some bonous hence their  salary is :"+jp.salary);

	}

}
class SoftwareEmployee
{
	double salary = 80000.00;
}
class JavaProgrammer extends SoftwareEmployee
{
	double bonous = 10000;;
	
	public void salaryCalculation()
	{
		 salary = salary+bonous;
		
	}
}

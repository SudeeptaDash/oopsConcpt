package oopsConcept;

public class TCS
{
	

	public static void main(String[] args) 
	{
		TataGroup tg = new TataGroup();
		TCS tcs = new TCS();
		System.out.println(tg instanceof TataGroup);//true
		System.out.println(tg instanceof TCS);//true
		System.out.println(tcs instanceof TCS);//true
		System.out.println(tcs instanceof TataGroup); //false

	}

}
class TataGroup extends TCS
{
	
}

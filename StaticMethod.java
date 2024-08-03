package oopsConcept;

public class StaticMethod 
{
	int a;
	int b;
	static String c = "GIET";
	
	StaticMethod(int a1, int b1)
	{
		a = a1;
		b = b1;
		
	}
	
	public static void change()
	{
		c = "GIETU";
	}
	
	
	public static void main(String[] args) 
	{
		StaticMethod sm = new StaticMethod(1,3);
		change();
		System.out.println(sm.a);
		System.out.println(sm.b);
		System.out.println(c);
		

	}

}

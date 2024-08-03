package oopsConcept;

public class DownCasting 
{

	public static void main(String[] args) 
	{
		//chick ck = new cock; 
		//Getting compile time error 
		
		//chick ck =(chick) new cock(); // Type casted
		//Getting class cast Exception
		
		cock ck = new cock();
		 
	
	}
	public void does(cock ck)
	{
		
	}

}
class cock
{
	
}
class chick extends cock
{
	
}

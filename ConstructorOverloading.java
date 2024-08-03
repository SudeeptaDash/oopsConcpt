package oopsConcept;

public class ConstructorOverloading 
{

	public static void main(String[] args) 
	{
		Apartment a = new Apartment(245,"SwapnaSoudha");
		Apartment a1 = new Apartment("SwapnaSagar",241);
		Apartment a2 = new Apartment("DwarikaNivas",240,20000.20);
		Apartment a3 = new Apartment(30000.00,"DashNivas",249);
		
		a.apartmentDetails();
		a1.apartmentDetails();
		a2.apartmentDetails();
		a3.apartmentDetails();
		
		

	}

}
class Apartment
{
	int apartmentno;
	String apartmenttype;
	double rent;
	
	Apartment(int ano,String aname)
	{
		apartmentno =ano;
		apartmenttype = aname;
		
	}
	Apartment(String aname,int ano)
	{
		apartmentno =ano;
		apartmenttype = aname;
		
	}
	Apartment(String aname,int ano,double arent)
	{
		apartmentno =ano;
		apartmenttype = aname;
		rent = arent;
		
	}
	Apartment(double arent,String aname,int ano)
	{
		apartmentno =ano;
		apartmenttype = aname;
		rent = arent;
		
	}
	public void apartmentDetails()
	{
		System.out.println(apartmentno+" - "+apartmenttype+" - "+rent);
	}
}

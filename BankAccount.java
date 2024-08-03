package oopsConcept;

public class BankAccount {

	public static void main(String[] args) 
	{
		Account a = new Account();
		a.insertRecords(10009191,"Sudeepta Dash" ,900000.00);
		a.deposit(90000);
		a.withdrawal(1000.00);
		a.displayDetails();
		a.balanceCheck();
		

	}

}
class Account
{
	int accountno;
	String name;
	double amount;
	
	public void insertRecords(int accno,String aname,double amt)
	{
		accountno = accno;
		name = aname;
		amount = amt;
	}
	public void deposit(double damt)
	{
		 amount = amount+damt;
		 System.out.println("AMOUNT "+damt+" CREDITED IN YOUR "+accountno);
		 System.out.println("The balance after deposite is : "+amount);
	}
	public void withdrawal(double wamt)
	{
		if(wamt>amount)
			System.out.println("oops!!Insufficient balance!!!");
		else
			amount = amount-wamt;
		System.out.println(wamt+" get debited from your "+accountno+" and the remaining balance is "+amount);
	}
	public void balanceCheck()
	{
		System.out.println("YOUR CURRENT BALANCE IS "+amount+" INR");
	}
	public void displayDetails()
	{
		System.out.println(accountno+"-"+name+"-"+amount);
	}
}

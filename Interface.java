import Account.Deposit;
import Account.withdraw;
import java.io.*;
import java.util.Scanner;
abstract class Account
{
	//protected String custName;
	String custName;
	private int accno;
	private float balance; //data hiding
	final String bankName = "SBI";
	//  abstract float balance();
	//abstract float interestCalc();

	Account()
	{
		custName = "";
		accno = -1;
	}
	Account(String custName)
	{
		this.custName = custName;
	}
	Account(String custName,int accNo)
	{
		this(custName); //constructor chaining
		this.accno = accNo;
	}
	public void read() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
			System.out.println("Enter the customer name:");
		custName = br.readLine();
		System.out.println("Enter the Account Number:");
		accno = Integer.parseInt(br.readLine());
		System.out.println("Enter the balance:");
		balance = Float.parseFloat(br.readLine());
		
		
	}
	public void disp()
	{
		System.out.println(" Bank Name = "+bankName);
		System.out.println(" A customer Name = "+custName);
		System.out.println(" A customer NO. = "+accno);
		System.out.println(" Balance amount = "+balance);
	}
	// Access the private variable we use Getter method
	public float getBalance() 
	{
		return balance;
	}
	public void setBalance(float b)
	{
		balance = b;

	}

}

class SavingAccount extends Account implements withdraw
{
	private float minbal;

	public void read() 
	{
		try
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		super.read();
		System.out.println("Enter the minimum balance");
		minbal=Float.parseFloat(br.readLine());	
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}		
	}

	public void disp()
	{
		super.disp();
		//access specifier
		System.out.println("Minimum Balance : "+minbal);
		//System.out.println("Account No : "+accno);
	}

	public void withdraw1()
	{
		try
		{
			int amt;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the amount to withdraw : ");
		amt=Integer.parseInt(br.readLine());
		if(getBalance()-amt>minbal) //get private variable balance by using getbalance()
		{
			setBalance(getBalance()-amt);
		}
		else
		{
			System.out.println("Sorry..! Amount exceeeds minimum balance\n");
		}	
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
}

/*
class LoanAccount extends Account
{
	float intRate;
	int amountSanc;
	public LoanAccount()
	{
		super();
		intRate = (float)0.0;
		amountSanc = 0;
	}
	public LoanAccount(String custName,int accno,float intRate,int amount)
	{
		super(custName,accno);
		this.intRate = intRate;
		amountSanc = amount;
	}
	public void read()
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			super.read();
			System.out.println("Enter the Interest Rate:");
		intRate = Float.parseFloat(br.readLine());
		System.out.println("Enter the maximum amount sanctioned:");
		amountSanc = Integer.parseInt(br.readLine());
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	public void disp()
	{
		super.disp();
		System.out.println("Interest rate : "+intRate);
		System.out.println("Maximum Amount sanctioned : "+amountSanc);
	}

	final float interestCalc()
	{
		return(intRate*amountSanc)/100;
	}
}
final class CarLoan extends LoanAccount
{
	String carCompany;
	String carModel;
	int carCost;

	CarLoan()
	{
		carCompany="Maruti";
		carModel="Baleno";
		carCost=700000;
	}

	CarLoan(String custName,int accno,float intRate,int amount,String comp,String model,int cost)
	{
		super(custName,accno,intRate,amount);
		carCompany = comp;
		carModel = model;
		carCost = cost;
	}
	public void read()
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			super.read();
			System.out.println("Enter the car company Name:");
			carCompany = br.readLine();
			System.out.println("Enter the car model:");
			carModel = br.readLine();
			System.out.println("Enter the car cost:");
			carCost = Integer.parseInt(br.readLine());
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	public void disp()
	{
		float totInte;
		//totInte=interestCalc();
		super.disp();
		System.out.println("Car Company Name:"+carCompany);
		System.out.println("Car Model:"+carModel);
		System.out.println("Car cost:"+carCost);
		//System.out.println("Total Interest:"+totInte);
	}
/*float interestCalc()
{
	return(intRate*amountSanc+1000)/100;
}*/

//}         */

public class Interface
{
	public static void main(String arg[])
	{
		SavingAccount ac=new SavingAccount();
		ac.read();
		ac.disp();
		ac.withdraw1();
		ac.disp();
	}
}
/*
public class Abstract
{
	public static void main(String args[])throws IOException
	{
		//Account a2 = new Account();
		//a2.read();
		//a2.disp();
		Account a2 = new LoanAccount();
		a2.read();
		//a2.disp();

		//Account a3 = new Account("aaa",20);
		//a3.read();
		//a3.disp();
		//static int a =10;
		LoanAccount ls = new LoanAccount();
		//ls.read();
		//System.out.println(ls.custName);
		ls.disp();
		/*  LoanAccount la = new LoanAccount("aaa",20,(float)10.5,100000);
	 la.disp();        */
	// Account ac = new LoanAccount();
//	 ac.disp();

	 //Account ac1 = new CarLoan();
	 //ac1.disp();
//	}
//}

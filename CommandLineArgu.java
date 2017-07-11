import java.io.*;
import java.util.Scanner;
class Customer
{
	String cName;
	byte cAge;
	long accNo;
	char gender;
	short minBal;
	float balance;
	public void read() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the customer name:");
		cName = br.readLine();
		System.out.println("Enter the age of customer:");
		cAge = Byte.parseByte(br.readLine()); 
		System.out.println("Enter the account number of customer:");
		accNo = Long.parseLong(br.readLine()); 
		System.out.println("Enter the minimum balance of customer:");
		minBal = Short.parseShort(br.readLine()); 
		System.out.println("Enter the  balance of customer:");
		balance = Float.valueOf(br.readLine()).floatValue(); 
		System.out.println("Enter the gender of customer:");
		gender = (char)br.read(); 
	}
	public void display()
	{
		System.out.println("Customer Name:"+cName);
		System.out.println("Customer Age:"+cAge);
		System.out.println("Customer Account No.:"+accNo);
		System.out.println("Minimum Balance:"+minBal);
		System.out.println("Balance Amount:"+balance);
		System.out.println("Customer Gender:"+gender);
		 
	}
	public Customer()
	{
		System.out.println("Datatype program");
		cName = "Manager";
		cAge = 23;
		accNo= 14785236;
		minBal = 5000;
		balance = 50000;
		gender = 'M';
	}
	public Customer(String a,byte a1)
	{
		System.out.println("Datatype program");
		cName = a;
		cAge = a1;
		accNo= 14785236;
		minBal = 5000;
		balance = 50000;
		gender = 'M';
	}
	public Customer(String na, char gen , float bal)
	{
		System.out.println("Datatype program");
		cName = na;
		cAge = 23;
		accNo= 14785236;
		minBal = 5000;
		balance = bal;
		gender = gen ;
	}
	byte search(String name)
	{
		if(cName.equals(name))
			return 1;
		else
			return 0;
	}
	byte search(long acno)
	{
		if(accNo==acno)
			return 1;
		else 
			return 0;
	}
	byte search(float bal , char gen)
	{
		if ((float)bal==(float)balance && gender==gen)
			return 1;
		else
			return 0;
	}
}
public class CommandLineArgu
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean ch = true;
		byte res,res1,b1=0;
		Customer ob1=new Customer("BManager",'M',1255688);
		ob1.display();
		Customer obj[] = new Customer[2];
		while(ch)
		{
			System.out.println("1.Read Data");
			System.out.println("2.Display Data");
			System.out.println("3.Search data");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			res = Byte.parseByte(br.readLine());
			switch(res)
			{
				case 1: for(byte i=0;i<2;i++)
						{
							obj[i]=new Customer();
							obj[i].read();
							
						}
						break;
				
				case 2: for(byte i=0;i<2;i++)
						{
							obj[i].display();
							
						}
						break;
				case 3:
						System.out.println("1.By name");
						System.out.println("2.By Account Number");
						System.out.println("3.By Balance and Gender");
						res1 = Byte.parseByte(br.readLine());
						switch(res1)
						{
							case 1: String n,n1;
									//System.out.println("Enter the name to search");
									//n = br.readLine();
									n = args[0];
									for(byte i=0;i<2;i++)
									{
										b1=obj[i].search(n);
										if(b1==1)
										{
											obj[i].display();
											break;
										
										}
									}
									if(b1==0)
									{
										System.out.println("record not available");
									}
									break;
							case 2 : long acno;
									System.out.println("Enter the Account Number to search");
									acno = Long.parseLong(br.readLine());
									for(byte i=0;i<2;i++)
									{
										b1=obj[i].search(acno);
										if(b1==1)
										{
											obj[i].display();
											break;
										}
									}
									if(b1==0)
									{
										System.out.println("record not available");
									}
									break;
							case 3: char gender;
									float balance;
									System.out.println("Enter the gender to search");
									gender = (char)br.read();
									System.out.println("Enter the Balance account to search");
									br.skip(2);
									balance = Float.parseFloat(br.readLine());
									
									
									for(byte i =0;i<2;i++)
									{
										b1 = obj[i].search(balance,gender);
										if(b1==1)
										{
											obj[i].display();
											break;
										}
									}
									if(b1==0)
									{
										System.out.println("record not available");
									}
									break;
						}
						break;
				case 4: ch = false; 
						
			}
			
			
		}
	}
}
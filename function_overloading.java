// Banking domain
import java.io.*;
import java.util.Scanner;
class customer
{
private String custName;
private byte custAge;
private long accNo;
private char gender;
private short minBal;
private float balance;
private long custid;
static long scustid;

static
{
int a=10;
int b=20;
int c=a+b;
scustid=100;
System.out.println(c);
System.out.println(scustid);
}

public static void show()
{
      System.out.println("Last Employee ID = "+scustid);

}
 public customer()
 {
   scustid++;
   custid=scustid;
 }
/*
public customer()
{
  System.out.println("hello\n");
  custName="ss";
  custAge=0;
  accNo=-1;
  gender='F';
  minBal=0;
  balance=0;
//  custId=0;
}

public customer(String a,Byte a1)
{
  System.out.println("hello\n");
  custName="ss";
  custAge=03;
  accNo=-12;
  gender='F';
  minBal=10;
  balance=0;
//  custId=0;
}

public void read() throws IOException
{
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

// Second method for BufferedReader
  /* InputStreamReader sr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(y);
  Scanner sc=new Scanner(System.in); */
/*
  System.out.println("Enter the customer Name:\t");
  custName = br.readLine();

  System.out.println("Enter the customer age:");
  custAge = Byte.parseByte(br.readLine());

  System.out.println("Enter the Account number:");
  accNo= Long.parseLong(br.readLine());

  System.out.println("Enter the minimum balance:");
  minBal=Short.parseShort(br.readLine());

  System.out.println("Enter the balance Amount:");
  balance=Float.valueOf(br.readLine()).floatValue();

  System.out.println("Enter the Gender");
  gender=(char)br.read();

}

public void display() throws IOException
{
  System.out.println("\n");
  System.out.println("Custumer name : "+custName);
  System.out.println("Customer age : "+custAge);
  System.out.println("Account number : "+accNo);
  System.out.println("Minimum Balance : "+minBal);
  System.out.println("Balance Amount : "+balance);
  System.out.println("Gender : "+gender);
  System.out.println("Customer ID = "+custid);
  System.out.println("\n");
}
byte search(String name)
{
if(custName.equals(name))
return 1;
else
return 0;
}

int search(long acno)
{
if(acno==accNo)
return 1;
else
return 0;
}

byte search(float bal, char gend)
{
  if(bal>=balance && gender==gend)
  return 1;
  else
  return 0;
}
*/
}
public class function_overloading
{
public static void main(String args[]) throws IOException
{
/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
boolean ch=true;
byte res ,res1,b1=0;
customer ob1=new customer("gg",(byte)3);
ob1.display();
customer obj[]=new customer[2];
while(ch)
{
  System.out.println("1. Read data");
  System.out.println("2. Display data");
  System.out.println("3. Search data");
  System.out.println("4. Exit");
  System.out.println("Enter your choice\n");
res=Byte.parseByte(br.readLine());
  switch(res)
  {
    case 1:for(byte i=0;i<2;i++)
            {
              obj[i]=new customer();
              obj[i].read();
            }
            break;

    case 2:for(byte i=0;i<2;i++)
            {
              obj[i].display();
            }
            break;
    case 3: System.out.println("1 By Name");
            System.out.println("2.By Account Number");
            System.out.println("3.My balance and gender");

            System.out.println("Enter the choice\n");
            res1=Byte.parseByte(br.readLine());
            switch(res1)
            {
                case 1: String n;
                        System.out.println("Enter the name to search");
                        n=br.readLine();
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
                                  System.out.println("Record not available");
                                }
                                break;
                case 2: long accno;
                        System.out.println("Enter the Account Number to search");
                        accno=Long.parseLong(br.readLine());
                        for(byte i=0;i<2;i++)
                        {
                          b1=(byte)obj[i].search(accno);
                          if(b1==1)
                          {
                            obj[i].display();
                            break;
                          }
                        }
                            if(b1==0)
                            {
                              System.out.println("Record not available");
                            }
                            break;
                case 3: char gender;
                        float bal;
                                    System.out.println("Enter the gender to search");
                                    gender=(char)br.read();  //Along the character enter line
                                    br.skip(2); // to skip new line character from char
                                    System.out.println("Enter the balance amount to search");
                                    bal=Float.parseFloat(br.readLine());
                                    for(byte i=0;i<2;i++)
                                    {
                                      b1=obj[i].search(bal,gender);
                                      if(b1==1)
                                      {
                                        obj[i].display();
                                        break;
                                      }
                                    }
                                    if(b1==0)
                                    {
                                      System.out.println("Record not available");
                                    }
                                    break;
            }
            break;

    case 4: ch=false;

  } //end of outer
} //end of while*/
 customer oj=new customer();
 //oj.show();
 customer.show();

} //End of main
} // end of main class

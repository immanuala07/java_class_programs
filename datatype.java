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
  System.out.println("\n");
}
}
public class datatype
{
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
boolean ch=true;
byte res ,res1,b1;
customer ob1=new customer("gg",(byte)3);
ob1.display();
customer obj[]=new customer[2];
while(ch)
{
  System.out.println("1. Read data");
  System.out.println("2. Display data");
  System.out.println("3. Exit");
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
    case 3: ch=false;

  } //end of outer
 } //end of while
} //End of main
} // end of main class

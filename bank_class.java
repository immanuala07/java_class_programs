// Banking domain

class customer
{
private String custName;
private byte custAge;
private long accNo;
private char gender;
private short minBal;
private float balance;
}
public void read()
{
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

// Second method for BufferedReader
  /* InputStreamReader sr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(y);
  Scanner sc=new Scanner(System.in); */

  System.out.printn("Enter the customer Name:\t");
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

public void display()
{
  System.out.println("Custumer name : "+custName);
  System.out.println("Customer age : "+custAge);
  System.out.println("Account number : "+accNo);
  System.out.println("Minimum Balance : "+minBal);
  System.out.println("Balance Amount : "+balance);
  System.out.println("Gender : "+gender);
}

publc class datatype
(
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


}

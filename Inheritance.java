import java.util.*;
import java.io.*;
class Account
{
  private String custName;
  private int accno;
  private float balance;



    Account()
    {
      custName="";
      accno=1;
    }

        Account(String custName)
        {
            this.custName=custName;
        }

              Account (String custName, int accno)
              {
                this(custName); //constructor chaining
                this.accno=accno;
              }

                  public void read() throws IOException
                  {
                      InputStreamReader isr = new InputStreamReader(System.in);
                      BufferedReader br = new BufferedReader (isr);
                      System.out.println("nEnter the Custumer Name");
                      custName=br.readLine();
                      System.out.println("Enter the account no:");
                      accno=Integer.parseInt(br.readLine());
                  }

                        public void disp()
                        {
                            System.out.println("Custome Name : "+custName);
                            System.out.println("Custome Account no : "+accno);

                        }

                      /*      public float getbalance()
                            {
                              return balance;
                            }

                                public void setbalance(float bal)
                                {
                                  balance = bal;
                                }    */
// how to create automatically id;

                                          class loanAccount extends Account
                                          {
                                            float intRate;
                                            int amountSanc;

                                            public loanAccount(String custname, int accno, float intRate, int amount)
                                            {
                                              super(custName,accno);
                                              this.intRate=intRate;
                                              amountSanc=amount;
                                            }

                                                public void read()throws IOException
                                                {
                                                  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                                  super.read();
                                                  System.out.println("Ënter the interst rate");
                                                  intRate =Float.parseFloat(br.readLine());
                                                  System.out.println("Enter the maximum amount sanctioned");
                                                  amountSanc=Integer.parseInt(br.readLine());

                                                }

                                                public void disp()
                                                {
                                                  super.disp();
                                                  //access specifier
                                                  System.out.println("Interset rate :"+intRate);
                                                  System.out.println("maximum amt an: "+amountSanc);

                                                }
                                                      final float interestCalc()
                                                      {
                                                        return (intRate * amountSanc)/100;

                                                      }


                                          }
                                        }




                                                  public class Inheritance
                                                  {
                                                    public static void main(String args[])throws IOException
                                                    {
                                                      ss

                                                    }
                                                  }

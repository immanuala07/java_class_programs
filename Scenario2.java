import java.io.*;

class Employee
{
  private String name;
  private static long empId;  // Generates automatically
  private float bPay;


  static
  {
  empId=100;
  }



    public void readdata()throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//  System.out.println("\nEmployee ID : "+empId );
        System.out.println("\nEnter the Employee Name : ");
        name=br.readLine();

        System.out.println("Enter the Basic pay : ");
        bPay=Float.parseFloat(br.readLine());
    }

            public void display() throws IOException
            {
                float s=0;
                int i;
                System.out.println("\n-------------------------");
                System.out.println("Employee ID : "+(empId++) );
                System.out.println("-------------------------");
                System.out.println("Employee Name : "+name);
                System.out.println("Basic pay : "+bPay);
                s=Calculatesalary();
                System.out.println("Total Wage : "+s);
                System.out.println("-------------------------\n");
            }




                              public float Calculatesalary()throws IOException
                              {
                                float s;
                                s=(float)((0.5 *bPay)+(0.1 *bPay) + bPay);
                                return s;
                              }
}

    public class Scenario2
    {
      public static void main(String args[]) throws IOException
      {
        boolean ch=true;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        byte c,n;

        Employee e[] = new Employee[10];

        System.out.println("Enter number of employees : ");
        n=Byte.parseByte(br.readLine());

         while(ch)
         {
           System.out.println("\n1 Read data");
           System.out.println("2 Display data");
           System.out.println("3 Exit");
           System.out.println("Enter your choice\n");
           c=Byte.parseByte(br.readLine());

           switch(c)
           {
             case 1: for (int i=0;i<n;i++)
                      {
                        e[i]=new Employee();
                        e[i].readdata();
                      }
                      break;

             case 2:for (int i=0;i<n;i++)
                      {

                        e[i].display();
                      }
                      break;
            case 3:ch=false;
                    break;
           }
         }
      }
    }

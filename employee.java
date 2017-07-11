import java.io.*;
class emp
{
private String empid;
private String name;
private Integer basic_pay;

    public void readdata() throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Employee ID: ");
        empid=br.readLine();

        System.out.println("Enter the Employee Name: ");
        name=br.readLine();

        System.out.println("Enter the Basic pay: ");
        basic_pay=Integer.parseInt(br.readLine());

    }

            public void display()throws IOException
            {
                float da=0,hra=0,s=0;
                System.out.println("Employee Salary Details");
                System.out.println("***********************");
                System.out.println("Employee Name : " +name);
                System.out.println("Employee ID : " +empid);
                System.out.println("Basic Pay : " +basic_pay);
                da=(float)(basic_pay * 0.5);
                System.out.println("DA : "+da);
                hra=(float)(basic_pay * 0.1);
                System.out.println("HRA : "+hra);
                s=calculate(da,hra);

                System.out.println("Total Salary : " +s);
            }

                    public float calculate(float da,float hra) throws IOException
                    {
                        float s=0;
                        s=(float)hra+da+basic_pay;
                        return s;
                    }
}

          class employee
                        {
                            public static void main(String args[]) throws IOException
                            {
                              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                              boolean ch=true;
                              byte res;
                              emp obj[]= new emp[1];
                              while(ch)
                              {

                                  System.out.println("\n1. Read data");
                                  System.out.println("2. Display data");
                                  System.out.println("3. Exit\n");

                                  System.out.println("Enter your choice\n");
                                  res=Byte.parseByte(br.readLine());
                                  switch(res)
                                  {
                                    case 1:for(byte i=0;i<1;i++)
                                            {
                                              obj[i]=new emp();
                                              obj[i].readdata();
                                            }
                                            break;

                                    case 2:for(byte i=0;i<1;i++)
                                            {
                                              obj[i].display();
                                            }
                                            break;
                                    case 3: ch=false;

                                  } //end of outer
                              }
                            }
                        }

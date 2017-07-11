import java.io.*;
class student
{
private byte rno;
private String name;
private String course;
private byte subj1;
private byte subj2;
private byte subj3;
private byte subj4;
private byte subj5;
private Integer percent;

    public void read() throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        // Second method for BufferedReader
        /* InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(y);
        Scanner sc=new Scanner(System.in); */

        System.out.println("Enter the Student Name:\t");
        name = br.readLine();

        System.out.println("Enter the Student roll no:");
        rno = Byte.parseByte(br.readLine());

        System.out.println("Enter the Course name:");
        course= br.readLine();

        System.out.println("Enter the Marks of SUbject 1");
        subj1= Byte.parseByte(br.readLine());

        System.out.println("Enter the Marks of SUbject 2");
        subj2= Byte.parseByte(br.readLine());

        System.out.println("Enter the Marks of SUbject 3");
        subj3= Byte.parseByte(br.readLine());

        System.out.println("Enter the Marks of SUbject 4");
        subj4= Byte.parseByte(br.readLine());

        System.out.println("Enter the Marks of SUbject 5");
        subj5= Byte.parseByte(br.readLine());

      }

              public void display() throws IOException
              {
                  float s=0,p;
                  System.out.println("Name : "+name);
                  System.out.println(" Course Name : "+course);
                  System.out.println("rno : "+rno);
                  System.out.println("Subject 1 : "+subj1);
                  System.out.println("Subject 2 : "+subj2);
                  System.out.println("Subject 3 : "+subj3);
                  System.out.println("Subject 4 : "+subj4);
                  System.out.println("Subject 5 : "+subj5);
                  p = calculate();
                  System.out.println("Percentage : " +p " % ");
              }

              public float calculate() throws IOException
              {
                s=subj1+subj2+subj3+subj4+subj5;
                System.out.println("Total marks : "+s);
                p=((s*100)/500).floatValue();
              }

}

                        class stud
                        {
                            public static void main(String args[])
                            {
                              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                              boolean ch=true
                              String n;
                              System.out.println("Enter the number of students");
                              n=Integer.parseInt(br.readLine());
                              student s= new Student[n]
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

                                } //end of outer  System.out.println("1. Read data");
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

                              }
                            }
                        }

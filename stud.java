import java.io.*;
import java.util.*;
class student
{
private byte rno;
private String name;
private String course;
private byte[] subj= new  byte[10];


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

        for(byte i=0;i<5;i++)
        {
        System.out.println("Enter the Marks of SUbject " +(i+1));
        subj[i]= Byte.parseByte(br.readLine());
        }
      }

              public void display() throws IOException
              {
                  float s=0,p;
                  System.out.println("Name : "+name);
                  System.out.println(" Course Name : "+course);
                  System.out.println("rno : "+rno);
                  for(byte i=0;i<5;i++)
                  {
                  System.out.println("Subject  : "+(i+1)+ " "+subj[i]);
                  }

                  p = calculate();
                  System.out.println("Percentage : " +p+ " % ");
              }

              private float calculate() throws IOException
              {
                float p;
                float s=0;
                for(byte i=0;i<5;i++)
                s=subj[i]+ s;
              //  s=subj1+subj2+subj3+subj4+subj5;
              //  System.out.println("Total marks : "+s);
                p=(float)((s*100)/500);
                return p;
              }

}

                        class stud
                        {
                            public static void main(String args[]) throws IOException
                            {
                              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                              boolean ch=true;
                              // String n;
                              byte res;
                            //  System.out.println("Enter the number of students");
                            //  n=Integer.parseInt(br.readLine());
                              student obj[]= new student[2];
                              while(ch)
                              {
                                  System.out.println("Enter the number of students");
                                  System.out.println("1. Read data");
                                  System.out.println("1. Display data");
                                  System.out.println("1. Exit");

                                  System.out.println("Enter your choice\n");
                                  res=Byte.parseByte(br.readLine());
                                  switch(res)
                                  {
                                    case 1:for(byte i=0;i<2;i++)
                                            {
                                              obj[i]=new student();
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

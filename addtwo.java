import java.io.*;
class addtwo
{
public static void main(String arg[])
{
int a,b,c;
DataInputStream t = new DataInputStream(System.in);
System.out.println("Enter no.s");
a=Integer.parseInt(t.readLine(arg[0]));
b=Integer.parseInt(t.readLine(arg[1]));
c=a+b;
System.out.println(c);
}

}
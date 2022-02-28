import java.io.*;
class Book
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("a.txt");

FileOutputStream fout=new FileOutputStream("b.txt");

int ch;
while((ch=fin.read())!=-1)
fout.write(ch);

System.out.println("File content Copy...");

String s1="end of file";

byte b[]=s1.getBytes();
fout.write(b);

fin.close();
fout.close();

}
catch(Exception e)
{
System.out.println(e);
}
}
}





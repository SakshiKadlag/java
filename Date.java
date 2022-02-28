
import java.util.Scanner;


class InvalidDateException extends Exception {
    String msg;

    InvalidDateException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg;
    }
}

// import java.util.Scanner;
class MyDate {
    int day;
    int month;
    int year;

    void accept(int d, int mon, int y) {
        day = d;
        month = mon;
        year = y;
    }

    void display() {
        System.out.println("day\tmonth\tyear");
        System.out.println(day + "\t" + month + "\t" + year);
    }

    // int invalidate() {
    // if (day > 31 || month > 12) {
    // return 1;
    // }

}

class Date {
public static void main(String arg[])
{
Scanner input=new Scanner(System.in);
 MyDate D=new MyDate();

System.out.println("enter day");
int dd=input.nextInt();

System.out.println("enter month");
int mm=input.nextInt();

System.out.println("enter year");
int yy=input.nextInt();

D.accept(dd,mm,yy);

int m=D.month;
switch(m)
{
    case 1:case 3:case 5:case 7:case 8: case 10:case 12:

try
{
    if(D.day>31 )
    
     {
         throw new InvalidDateException("Invalid date format");

     }

     else
     {
         D.display();


     }
 }




catch(InvalidDateException e)
{

System.out.println("ERROR:"+e);

}

break;

case 4:case 6:case 9:case 11:

try

{
    if(D.day>30)
    
    {
        throw new InvalidDateException("Invalid date format");

    }

    else
    {
        D.display();


    } 

}
catch(InvalidDateException e)
{

System.out.println("ERROR:"+e);

}
break;


case 2:
try
{
    if(D.day>29 || (D.year%4!=0))
{
    throw new InvalidDateException("Invalid date format");
}
else
{
    D.display();


} 
}
catch(InvalidDateException e)
{

System.out.println("ERROR:"+e);

}
break;




}
// if(D.invalidate()==1)
// {
// throw new MyException("Invalid date format");
// }
// else 
// D.display();
// }
// catch (MyException e)
// {
// System.out.println("ERROR:"+e);
// } 

try
{
    if(D.month>12)
    {
        throw new InvalidDateException("Invalid date format");

    }
    

}
catch(InvalidDateException e)
{

System.out.println("ERROR:"+e);

}
}
}

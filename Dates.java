import java.util.*;
import java.text.SimpleDateFormat;
class Dates{

    public static void main(String arg[])
    {
        Date d=new Date();
        //System.out.println("Current date and time=>" +d);
        SimpleDateFormat sdf=new SimpleDateFormat(" dd/MM/yyyy");
        String str=sdf.format(d);
        System.out.println("Current date and time=>"+str);


        sdf=new SimpleDateFormat(" dd-MM-yyyy");
         str=sdf.format(d);
        System.out.println("Current date and time=>"+str);

         
        sdf=new SimpleDateFormat(" EEEE MMMM dd yyyy");
        str=sdf.format(d);
       System.out.println("Current date and time=>"+str);
        
       System.out.println("Current date and time=>" +d);
       

       sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a Z");
        str=sdf.format(d);
       System.out.println("Current date and time=>"+str);
        
       sdf=new SimpleDateFormat("hh:mm:ss ");
       str=sdf.format(d);
      System.out.println("Current time is=>"+str);
       
      sdf=new SimpleDateFormat("w");
       str=sdf.format(d);
      System.out.println("Current week of the year is=>"+str);
       
      sdf=new SimpleDateFormat("W ");
       str=sdf.format(d);
      System.out.println("Current week of the month =>"+str);
     
      sdf=new SimpleDateFormat("D ");
       str=sdf.format(d);
      System.out.println("Current Day of the year is=>"+str);
       
    }
}

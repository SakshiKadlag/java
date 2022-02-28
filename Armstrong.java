import java.util.Scanner;
class Armstrong{
    public static void main(String arg[])
    {  int count=0,sum=0;
        int temp,mult,number,rem;

    Scanner input=new Scanner(System.in);

        System.out.println("enter a number");
        int value = input.nextInt();

           temp=value;
    
           //to find number of digit
  
    while(value>0)
    {
        value = value /10;
        count = count +1;

    }

    number=temp;
    while(number>0)
    {
        mult=1;
        rem=number%10;

        //from count to 1 multiplication of remainder

        for(int i=count;i>0;i--)
        {
            mult=mult*rem;
        }

        sum=sum+mult;
        number=number/10;
    }

    if(sum==temp)
    System.out.println("The number is Armstrong");

    else
    System.out.println("the number is not armstrong");
 
    
        
    }
}
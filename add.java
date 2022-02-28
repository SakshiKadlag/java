

import java.util.Scanner;
class add
{
    public static void main(String arg[])
{
    Scanner input=new Scanner(System.in);
    System.out.println("how many numbers");
    int n=input.nextInt();
    int sum=0;
    //for statement
    for(int i=1;i<=n;i++)
    {
        sum=sum+i;
    }
       System.out.println("sum" +sum);

     
}

}
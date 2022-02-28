import java.util.Scanner;

class alphabet
{
    public static void main(String arg[])
    {
        
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=input.nextInt();
        char ch='A';
            //for statement
            for(int i=1;i<=n;i++,ch++)
            {
               
                    System.out.print(ch + " ");
                }
            
    }
}

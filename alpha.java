    

import java.util.Scanner;

class alpha
{
    public static void main(String arg[])
    {
        
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=input.nextInt();
        char ch1='A';
        char ch2='a';
            //for statement
            for(int i=1;i<=n;i++,ch1++,ch2++)
            {
    
               
                    System.out.print(ch1 + "" + ch2 +"\t" );
                }
            
    }
}

//to accept n numbers,store into array and display array numbers in ascending order
import java.util.Scanner;
class Ascending
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter how many numbers");
        int n=input.nextInt();

        int a[]=new int[n];

        System.out.println("enter a number");
        for(int i=0;i<n;i++)
        {
           // System.out.println("enter a number");
            a[i]=input.nextInt();

        }
        System.out.println("Array element is");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+ "  ");
        }
        
        int temp;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }

        System.out.println("Array element in ascending order  is");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+ "  ");
        }
        
    } 
}


import java.util.Scanner;

class Diagonal{

    public static void main(String arg[])
    {

        Scanner input=new Scanner(System.in);
        int num;
        do{
            System.out.println("1.Sum of diagonal elements");
            System.out.println("2.Sum of upper diagonal elements");
            System.out.println("3.Sum of lower diagonal elements");
            System.out.println("0.Exit");

    
            System.out.println("enter your choice");
            num =input.nextInt();
             
           
            switch(num)
            {
                case 1:
                System.out.println("enter how many rows");
                int row=input.nextInt();
        
                System.out.println("enter how many columns");
                int column=input.nextInt();
        
                int a[][]=new int[row][column];
        
        
                System.out.println("enter the element ");
                for(int i=0;i<row;i++)
                {
                    for(int j=0;j<column;j++)
                    {
                    a[i][j]=input.nextInt();
                    }
                
                }
                System.out.println("Matrix  is");
                for(int i=0;i<row;i++)
                {
                    for(int j=0;j<column;j++)
                    {
                    System.out.print(a[i][j]+ "\t");
                   }
                   System.out.println("");
                 }
        
                 int sum=0;
        
                 for(int i=0;i<row;i++)
                 {
                     for(int j=0;j<column;j++)
                     {
                        if(i==j)
                        {
                
                        sum=sum+a[i][j];
                        }
        
                    }
                }
                System.out.println("Sum of diagonal elmement is =>"+sum);
                     
                break;

                case 2:
                System.out.println("enter how many rows");
                int row1=input.nextInt();
        
                System.out.println("enter how many columns");
                int column1=input.nextInt();
        
                int m[][]=new int[row1][column1];
        
        
                System.out.println("enter the element ");
                for(int i=0;i<row1;i++)
                {
                    for(int j=0;j<column1;j++)
                    {
                    m[i][j]=input.nextInt();
                    }
                
                }
                System.out.println("Matrix  is");
                for(int i=0;i<row1;i++)
                {
                    for(int j=0;j<column1;j++)
                    {
                    System.out.print(m[i][j]+ "\t");
                   }
                   System.out.println("");
                 }
        
                 int sum1=0;
        
                 for(int i=0;i<row1;i++)
                 {
                     for(int j=0;j<column1;j++)
                     {
                        if(j>i)
                        {
                
                        sum1=sum1+m[i][j];
                        }
        
                    }
                }
                System.out.println("Sum of upper diagonal elmement is =>"+sum1);
                  
                break;


                case 3:
                System.out.println("enter how many rows");
                int row2=input.nextInt();
        
                System.out.println("enter how many columns");
                int column2=input.nextInt();
        
                int t[][]=new int[row2][column2];
        
        
                System.out.println("enter the element ");
                for(int i=0;i<row2;i++)
                {
                    for(int j=0;j<column2;j++)
                    {
                    t[i][j]=input.nextInt();
                    }
                
                }
                System.out.println("Matrix  is");
                for(int i=0;i<row2;i++)
                {
                    for(int j=0;j<column2;j++)
                    {
                    System.out.print(t[i][j]+ "\t");
                   }
                   System.out.println("");
                 }
        
                 int sum2=0;
        
                 for(int i=0;i<row2;i++)
                 {
                     for(int j=0;j<column2;j++)
                     {
                        if(i>j)
                        {
                
                        sum2=sum2+t[i][j];
                        }
        
                    }
                }
                System.out.println("Sum of lower diagonal elmement is =>"+sum2);
                  
                break;
            

                case 0:
                System.out.println("Exit");
        
            }
        }while(num!=0);
    }
}

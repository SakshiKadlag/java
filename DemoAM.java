class Myclass
{
    private int a;
    int b;

    void setab()
    {
        a=45;
        b=30;

    }
    void display()
    {
        System.out.println("a=" +a+ "b="+b);

    }
    public class DemoAM
    {
        public static void main(String[] args)
        {
            Myclass M=new Myclass(); //object
            M.setab();
            M.display();
            M.b=34;
            System.out.println("b member is accessible="+M.b);
        }
    }
}

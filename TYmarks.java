package TY;

public class TYmarks
{
public int theory;
public int practical;

public void getdata(int theory,int practical)
{
this.theory=theory;
this.practical=practical;
}

public int total()
{
int total1;
total1=(this.theory+this.practical);
return total1;
}
}


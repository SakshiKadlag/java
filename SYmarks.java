package SY;
public class SYmarks
{
 public int ctotal;
public  int mtotal;
public  int eletotal;

public void getdata(int ctotal, int mtotal, int eletotal)
{
this.ctotal=ctotal;
this.mtotal=mtotal;
this.eletotal=eletotal;

}

public int total()
{
int total1;
total1=(this.ctotal+this.mtotal+this.eletotal);
return total1;
}
}


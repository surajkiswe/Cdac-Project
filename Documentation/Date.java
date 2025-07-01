package utility;
public class Date
{
 private int dd;
 private int mm;
 private int yy;
 public Date()
{
 dd=0;
 mm=0;
 yy=0;
}
public Date(int d,int m,int y)
{
 this.dd=d;
 this.mm=m;
 this.yy=y;
}
public void display()
{
 System.out.println(dd+"/"+mm+"/"+yy);
}
public void display(char ch)
{
 System.out.println(dd+""+ch+mm+""+ch+yy);
}
}
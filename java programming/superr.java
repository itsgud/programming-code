
class abc
{
    int n=34;
}
class xyz extends abc
{
      int n=10;
      void show(int n)
      {
           System.out.println("value of n localyy is:  "+n);
           System.out.println("value of n in child claas is :  "+this.n);
           System.out.println("value of n in parent  class is :  "+super.n);
          
      }
}
public class superr
{
    public static void main (String[]args)
    {
          xyz on=new xyz();
          on.show(12);

    }
}
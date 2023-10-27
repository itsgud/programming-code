
class riv
{
    int n,temp,rev=0,a;
    void sol()
    {
          a= n=112;
           while(n>0)
           {
                    temp=n%10;
                    rev=rev*10+temp;
                    n=n/10;

           }
           System.out.println("the no is:  "+a+"  reverse of the givn no is:  "+rev);

    }
} 
public class reverse
{
    public static void main(String[]args)

    {
         riv R=new riv();
         R.sol();

    }
}
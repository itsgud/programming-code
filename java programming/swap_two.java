
class swap
{
    public int a,b,temp;
    void get()
    {
         a=5;b=4;temp=0;
        System.out.println("value of a is: "+a+"   value of b is:  "+b);
    }
    void val()
    {
        temp=a; 
        a=b; b=temp;
        System.out.println("value of a is:  "+a+"  vale of b is:  "+b);
    }

}

public class swap_two
{
    public static void main(String[]args)
    {   
            swap S =new swap();
            S.get();  S.val();
     
    }
}
import java.util.*;
import java.util.Scanner;
class input
{
    public
       int [] a=new int [4];
        Scanner oj=new Scanner(System.in);

    void  takeValue()
    {
        for(int i=0;i<4;i++)
           {
             System.out.println("enter the value at: "+i+" index : " );
             a[i]=oj.nextInt();
           }

    }

    void show()
    {
         for(int i=0;i<4;i++)
         {
            System.out.println("vaues in the array is:  "+a[i]);
         }
    }
}
public class array
{
    public static void main(String[] args)
    {
        input obj=new input();
         
        obj.takeValue();
        obj.show();

    }
}

//import.java.io.FileinputStream;

public class exampleEx
{
    public static void main(String[] args)
    {
        int a=5,b=0,c=0;
        try
        {
            c=a/b;
            System.out.println("value after division is:  "+c);
        }
        catch(Exception e)
        {
            System.out.println("you cant use b=0 ");
            System.out.println(e);

        }
        System.out.println("hello...");
    }
}
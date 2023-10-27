class area
{
    void cal()
    {
        double r=5;
        double ar=3.14*r*r;
        System.out.println("area of the circle is:  "+ar);
    }
}
public class area_of_circle
{
         public static void main(String[] args)
         {
                   area A=new area(); // object declaration
                   A.cal(); // calling the function by object
         }
}
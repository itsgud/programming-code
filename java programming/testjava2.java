public class testjava2
{
     static int i=9;
     public int m=45;
     static void disp()
     {
        System.out.println("value of static i is:  "+i);

     }
     void show()
     {
        System.out.println("value of normal m variable is:  "+m);
     }
    public static void main(String[] args)
    {
          testjava2 T =new testjava2();  //declaration of object
          T.show();
          testjava2.disp();
          disp();
        

    }
}
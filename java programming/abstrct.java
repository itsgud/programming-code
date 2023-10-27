abstract class college
{
    abstract void admission();
    abstract void receipt();
}

class bca extends college
{
    void admission()
    {
        System.out.println("admision is open....");
    }
    void receipt()
    {
        System.out.println("total amount paid by student is rs 2000");
    }
}
class bsc extends college
{
    void admission()
    {
        System.out.println("admmisiion is open in physics department...");

    }
    void receipt()
    {
        System.out.println("total amount to be paid is rs 12000");

    }
}



public class abstrct
{
      public static void main(String[] args)
      {
          // college c = new college();  //wrong
          bsc obj1 = new bsc();
          bca obj2 = new bca();
          obj1.admission();
          obj1.receipt();
          obj2.admission();
          obj2.receipt();


      }
}
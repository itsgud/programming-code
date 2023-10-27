class threadA extends Thread
{
    public void run()
    {
        
        for (int j = 1; j <=5; j++) {
              System.out.println("thread a ")

            
        }
        System.out.println("exit from thread A");
    }
}
class threadB extends Thread
{
    public void run()
    {
        for (int i = 1; i <=5; i++) {
            System.out.println("thread B "+i);
        }
        System.out.println("exist from thread B ");
    }
}
public class threadEmaple
{
    public static void main(String[] args)
    {
        thread obj1

    }
}
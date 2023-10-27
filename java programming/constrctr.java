import java.util.Scanner;

class add
{
    public int a,b;
    Scanner obj =new Scanner(System.in);
     public  add()
     {
       
        System.out.println("welcome inside the default constructor");
        System.out.println("enter the value a :  ");
        a=obj.nextInt();
        System.out.println("enter the second no:  ");
        b=obj.nextInt();
    System.out.println("sumof the deaflut constructor is:  "+(a+b));
     }
     public add(int p,int q)
     {
        System.out.println("sum of the no in parameterized constructor is:  "+(p+q));
     }

}
public class constrctr
 {
      public static void main(String[] args) {
          
           add A =new add();
          A = new add(2,3);
      }
}

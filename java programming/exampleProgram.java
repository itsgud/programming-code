import java.util.*;
import java.util.Scanner;

public class exampleProgram
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("enter roll no.: ");
        n=obj.nextInt();
        System.out.println("enter name : ");
        String name=obj.next();
        System.out.println("name of the student if: "+name+"   roll no is: "+n);

        
    }
}
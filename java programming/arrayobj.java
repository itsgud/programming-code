
class result
{
    int first;
    int second;
    public result(int f,int s)
    {
        first=f;
        second=s;

    }
    public int getresult()
    {
        return first+second;
    }
}

public class arrayobj
 {
    public static void main(String[] args) 
    {
        result [] obj=new result[4]; // declration of arry of objects..
        obj[0]=new result(88,23);
        obj[1]=new result(23,23);
        obj[2]=new result(11, 12);
        obj[3]=new result(4,5);
        for (int i = 0; i < 4; i++) {
            System.out.println("total marks:  ");
            System.out.println(obj[i].getresult());
        }

        
    }

}

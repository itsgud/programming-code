class bcaTwo 
{
    public int m,n;
    public void get()
    {
        m=2;
        n=4;
        int sum=m+n;
        System.out.println("sum of the no is: "+sum);

    }
}
class third
{
    public static void main(String[]args)
    {
        bcaTwo b=new bcaTwo(); // decel of object
        b.get();
    }
}
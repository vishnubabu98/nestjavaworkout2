public class Instancee
{
    static int count =0;
    Instancee()
    {
        count++;
    }
    protected void finalize() throws Throwable
    {
        --count;
        System.out.println("number of objects left :"+count);

    }
    public static void main(String[] args)
    {
        Instancee n1 = new Instancee();
        Instancee n2 = new Instancee();
        Instancee n3 = new Instancee();

        System.out.println("number of Objects created : "+count);
        n1=null;
        n2=null;
        System.gc();
    }
}

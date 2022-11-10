public class MathFunction
{
    static void multiply(int a, int b)
    {
        int result = a*b;
        System.out.println("Result is "+result);
    }
    static void multiply(float a, float b)
    {
        float result= a * b;
        System.out.println("Result is "+result);
    }
    static void multiply(int a , float b)
    {
        float result = a * b;
        System.out.println("Result is "+result);
    }
    public static void main(String[] args) {

        multiply(4,3);
        multiply(4.5f,4.5f);
        multiply(4,3.5f);


    }
}
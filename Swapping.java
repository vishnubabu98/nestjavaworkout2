public class Swapping
{
    int num1, num2,num3;
    Swapping(int num3)
    {
        this.num3 = num3;
    }
    Swapping(int num1,int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    void swap(int a, int b) {

        int temp;
        System.out.println("Call by value");
        System.out.println("Before swapping \nvalue of a :" + a + "\nvalue of b :" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping \nvalue of a :" + a + "\nvalue of b :" + b);
    }
    static void swap(Swapping ob1, Swapping ob2)
    {
        int temp ;
        System.out.println("Call by reference");
        System.out.println("Before swapping \n(inside n2) value of num3 :" + ob1.num3
                +"\n(inside n3) value of num3 :" + ob2.num3);
        temp =ob1.num3;
        ob1.num3 = ob2.num3;
        ob2.num3=temp;
        System.out.println("After swapping \n(inside n2) value of num3 :" + ob1.num3
                +"\n(inside n3) value of num3 :" + ob2.num3);
    }
    public static void main(String[] args)
    {
        Swapping n1 = new Swapping(4,3);
        n1.swap(n1.num1, n1.num2);  // Call by Value
        Swapping n2 = new Swapping(8);
        Swapping n3 = new Swapping(7);
        swap(n2,n3); // Call by reference
    }
}

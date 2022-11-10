import java.util.Scanner;
public class Faculty
{
    private  int Faculty_id;
    private float salary;

}
class FullTimeFaculty extends Faculty
{
    float basic;
    float allowance;
    FullTimeFaculty(float basic,float allowance){
        this.basic=basic;
        this.allowance=allowance;

    }
    float salaryFull()
    {
        float result;
        result=(basic+allowance);
        return result;
    }
    void display(){

        System.out.println("Salary of FullTimeFaculty:"+salaryFull());
    }
}
class PartTimeFaculty extends Faculty{
    int hour;
    float rate;
    PartTimeFaculty(int hour,float rate){
        this.hour=hour;
        this.rate=rate;
    }
    float salaryPart(){
        float salary2;
        salary2=(hour*rate);
        return salary2;
    }
    void show(){
        System.out.println("salary of PartTimeFaculty:"+salaryPart());
    }
}
class Driverclass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter basic and Allowance  of FullTimeFaculty 1 Here:");
        FullTimeFaculty f1=new FullTimeFaculty(sc.nextFloat(),sc.nextFloat());
        f1.display();


        System.out.println("Enter hour and rate of PartTimeFaculty 1 Here:");
        PartTimeFaculty Part1=new PartTimeFaculty(sc.nextInt(),sc.nextFloat());
        Part1.show();


        System.out.println("Enter basic and Allowance  of FullTimeFaculty 2 Here:");
        FullTimeFaculty f2=new FullTimeFaculty(sc.nextFloat(),sc.nextFloat());
        f2.display();



        System.out.println("Enter hour and rate of PartTimeFaculty 2 Here:");
        PartTimeFaculty Pf2=new PartTimeFaculty(sc.nextInt(),sc.nextFloat());
        Pf2.show();

    }
}


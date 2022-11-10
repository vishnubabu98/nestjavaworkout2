package Flat;
import java.util.Scanner;

public class TwoBHK extends OneBHK{

    float room2Area;

    TwoBHK()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the room area");
        room2Area = sc.nextFloat();
        System.out.println("enter the hall area");
        hallArea = sc.nextFloat();
        System.out.println("enter the price");
        price = sc.nextInt();
    }

    TwoBHK(int room2Area,float hallArea,int price)
    {
        this.room2Area=room2Area;
        this.hallArea=hallArea;
        this.price = price;
    }

    public void show()
    {
        System.out.println("Room Area :"+ room2Area+"\n"+
                "Hall Area :" +hallArea+"\n"+
                "Price :"+price);
    }
}
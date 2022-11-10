package Flat;
import java.util.Scanner;

public class OneBHK {
    float roomArea;
    float hallArea;
    int price;

    OneBHK()
    {

    }

    OneBHK(float roomArea,float hallArea,int price)
    {
        this.roomArea= roomArea;
        this.hallArea=hallArea;
        this.price = price;
    }

    public void show()
    {
        System.out.println("Room Area :"+ roomArea+"\n"+
                "Hall Area :" +hallArea+"\n"+
                "Price :"+price);
    }

}
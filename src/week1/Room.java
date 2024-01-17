package week1;

import java.awt.*;

public class Room {
    float width;
    float length;
    public Room (float w,float l)  //constrector create
    {
        width=w;
        length=l;
    }
    public void computeDisplay()  //method create (no return)
    {
        float sqft=width*length;
        float sqyt=sqft/9;
        float amount= sqyt*10.5f;
        System.out.println("Carpeting Price ="+amount);
    }//end of compute and display

    public static void main(String[]args){
        Room room=new Room(42,25); //new obj create
        room.computeDisplay();
    }
}

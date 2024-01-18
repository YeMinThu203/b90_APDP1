package week1;
/*Write a program to convert Fahrenheit temperature to Centigrade. Use the normal human body temperature of 98.6 degrees Fahrenheit, as the test case. Use the formula Centigrade = 5/9 (Fahrenheit -32). Save the program as FahrenheitToCentigrade.java.*/

import java.util.Scanner;

public class FtoC {
    float  F;
    public FtoC ()
    {

    }
    public void calculate(float fah)
    {
        this.F=fah;
        float cen=((5/9.0f) * (fah-32));
        System.out.println(fah+" Fahrenheit is equal to "+cen+" Centigrade ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Fahrenheit Value :");
        float f=sc.nextFloat();
        FtoC ftocObj=new FtoC();
        ftocObj.calculate(f);



    }
}

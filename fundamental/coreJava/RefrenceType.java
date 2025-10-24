package coreJava;

import java.awt.*;         //only package use point
import java.util.Date;     //this page use only date

public class RefrenceType {
    int age = 55;               //instance variable

    public static void main(String[] args) {
        System.out.println("Non-permitive data type-------------------------------------------------------");

        String name = "lalit";
        System.out.println("String Length: " + name.length());

        RefrenceType s1 = new RefrenceType();
        System.out.println(s1.age);

        String names = "gopal";
        System.out.println("All Letters Upper Case: " + names.toUpperCase());
        System.out.println("All Letters Lower Case: " + name.toLowerCase());

        Point point1=new Point(1,1);
        Point point2=point1;
        point1.x=2;
        System.out.println("This is a refrence types "+point1);

        Date now=new Date();
        System.out.println("date Print:" + now);

    }
}


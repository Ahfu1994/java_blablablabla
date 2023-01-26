package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static int rectangle(int width , int height)
    {
        return width * height;
    }
    public static int square(int width)
    {
       // return width * width;
        return rectangle(width,width);
    }
    public static double triangle(double width , double height)
    {
        return 0.5*width*height;
    }

    public static void main(String[] args) {
        System.out.println(triangle(4,5.5));
        double d1 = 1.0/3.0;
        float f1 = 1.0f/3.0f;
        System.out.println("double = "+d1);
        System.out.println("float = "+f1);
	// write your code here
        System.out.println(3*5);
        System.out.println("area = " +3*5);
        int width;
        int height;
        int area;
        //width = 3;
        //height = 5;
        //area = width*height;
        //System.out.println("area = " +area);
        Scanner in = new Scanner (System.in);
        System.out.print("enter width : ");
        width = in.nextInt();
        //System.out.print("print width = " +width);
        System.out.print("enter height : ");
        height = in.nextInt();
        //area = width * height;
        area = rectangle(width,height);
        System.out.println("area("+width+ "x" +height+ ") = " +area);
        System.out.println(square(5));
    }
}

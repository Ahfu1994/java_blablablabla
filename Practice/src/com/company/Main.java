package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int [] x = new int[10];
        for(int i=0; i<x.length; i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(x));

        int sum=0;
        for (int i=0; i<x.length; i++)
        {
            if(x[i]%2==0)
            {
//                System.out.println("have");
                sum+=1;
            }
            else
            {
//                System.out.println("don't have");
            }
        }
        if(sum>=1)
        {
            System.out.println("have");
        }
        else
        {
            System.out.println("don't have");
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {
    public static boolean testScore(int interviewScore , int englishScore)
    {
        boolean isok;
        if (interviewScore >70 && englishScore >50)
        {
            isok = true;
        }
        else
        {
            isok = false;
        }
        return isok;
    }
    public static void main(String[] args)
    {
        System.out.println(testScore(75,40));
    }
//	// write your code here
//        int score;
//        score = 47;
//        if(score>=50)
//        {
//            System.out.println("ผ่าน");
//        }
//        else
//        {
//            System.out.println("ไม่ผ่าน");
//        }
//    }
}

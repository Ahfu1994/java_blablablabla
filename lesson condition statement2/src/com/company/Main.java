package com.company;

public class Main {
    public static String stromType(int speed) {
        String stormName = "";
        if (speed < 63) {
            stormName = " Depression";
        } else if (speed >= 63 && speed < 118) {
            stormName = "Tropical storm";
        } else {
            stormName = "Typhoon";
        }
        return stormName;
    }

    public static String zodic(int buddhistYear) {
        int z = buddhistYear % 12;
        String s = "";
        if (z == 0) {
            s = "มะเส็ง";
        } else if (z == 1) {
            s = "มะเมีย";
        } else if (z == 2) {
            s = "มะแม";
        } else if (z == 3) {
            s = "วอก";
        } else if (z == 4) {
            s = "ระกา";
        } else if (z == 5) {
            s = "จอ";
        } else if (z == 6) {
            s = "กุน";
        } else if (z == 7) {
            s = "ชวด";
        } else if (z == 8) {
            s = "ฉลุ";
        } else if (z == 9) {
            s = "ขาล";
        } else if (z == 10) {
            s = "เถาะ";
        } else if (z == 11) {
            s = "มะโมง";
        }
        return s;
    }

    public static void main(String[] args) {
        // write your code here
        //  System.out.println(stromType(120));
        System.out.println(zodic(2556));
        System.out.println(zodic(2557));
        System.out.println(zodic(2558));
        System.out.println(zodiac2(2564));
    }
    public static String zodiac2(int buddhistYear)
    {
        int z = buddhistYear % 12;
        String s = "";
        switch (z){
            case 0:
                s = "มะเส็ง";
                break ;
            case 1:
                s = "มะเมีย";
                break ;
            case 2:
                s = "มะแม";
                break ;
            case 3:
                s = "วอก";
                break ;
            case 4:
                s = "ระกา";
                break ;
            case 5:
                s = "จอ";
                break ;
            case 6:
                s = "กุน";
                break ;
            case 7:
                s = "ชวด";
                break ;
            case 8:
                s = "ฉลุ";
                break ;
            case 9:
                s = "ขาน";
                break ;
            case 10:
                s = "เถาะ";
                break ;
            case 11:
                s = "มะโมง";
                break ;
        }
        return s ;
    }
}

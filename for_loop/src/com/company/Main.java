package com.company;

public class Main {
    public static void demo1() {
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
            System.out.println("-----");
        }
        System.out.println("bye");
    }

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
    public static void printChar(){
        for( char c = 'A'; c <= 'Z' ;c++){
            System.out.printf("%c\n",c);
        }
    }
    public static void printCharBetter(char fromCh, char toCh){
        for( char c = fromCh ; c <= toCh ;c++){
            System.out.printf("%d %c\n",(int)c,c);
        }
    }


    public static void main(String[] args) {
	// write your code here
        //demo1();
        //multiplicationTable(20);
        //printChar();
        //printCharBetter('A', 'Z' );
        printCharBetter('ก', 'ฮ' );
    }
}

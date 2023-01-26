import java.util.Scanner;

public class EC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        int V, count;
        count = 0;
        V = sc.nextInt();
        for(int j=0; j<x.length; j++)
        {
            if (x[j] == V)
            {
               count = count + 1;
            }
        }
        if(count>0)
        {
            System.out.println("V is in array");
        }
        else
        {
            System.out.println("is not in array");
        }
    }
}


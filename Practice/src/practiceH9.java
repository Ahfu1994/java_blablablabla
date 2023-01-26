import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.Scanner;

public class practiceH9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[10];
        for(int i=0; i<x.length; i++)
        {
            x[i]=sc.nextInt();
        }
        int max, min;
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
        for(int j=0; j<x.length; j++)
        {
            if (x[j]>max)
            {
                max=x[j];
            }
        }
        System.out.println(max);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class practiceJ2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x = new int[10];
        for (int i = 0; i <x.length ; i++) {
            x[i] = sc.nextInt();
        }
        for(int j=0; j<x.length; j++)
        {
            for(int i=0; i<x.length-1; i++)
            {
                if(x[i+1]>x[i])
                {
                    int t=x[i];
                    x[i]=x[i+1];
                    x[i+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(x));
    }
}

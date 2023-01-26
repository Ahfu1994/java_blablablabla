import java.util.Arrays;
import java.util.Scanner;

public class EH14_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x = new int[3];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i]>max)
            {
                max = x[i];
            }
        }
        for (int i= 0; i <x.length; i++)
        {
            if(x[i]<min)
            {
                min = x[i];
            }
        }
        Arrays.sort(x);
        System.out.println(max);
        System.out.println(min);
        System.out.println(Arrays.toString(x));
    }
}

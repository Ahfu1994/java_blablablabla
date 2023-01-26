import java.util.Scanner;

public class EC3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x = new int[10];
        for(int i = 0; i < x.length; i++)
        {
            x[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int max_index = 0 ;
        for(int j = 0; j < x.length; j++)
        {
            if (x[j]>max)
            {
                max = x[j];
                max_index = j;
            }
        }
        System.out.println(max);
        System.out.println(max_index);
    }
}

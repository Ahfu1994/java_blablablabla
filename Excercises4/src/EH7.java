import java.util.Scanner;

public class EH7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []x = new int[10];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <x.length ; i++)
        {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i]>max)
            {
                max = x[i];
            }
        }
        System.out.println(max);
    }
}

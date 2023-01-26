import java.util.Scanner;

public class practiceH4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        for(int i=0; i<x.length; i++)
        {
            if (x[i]%2==0)
            {
                System.out.println(x[i]);
            }
            else
            {

            }
        }
    }
}

import java.util.Scanner;

public class ED6
{
    public static int LargestPowerOf2(int a)
    {
        int b = 1;
        while(b*2<a)
        {
           b=b*2;
        }
        if (b*2==a) return a;
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = LargestPowerOf2(x);
        System.out.println(y);
    }
}

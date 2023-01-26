import java.util.Scanner;

public class ED4
{
    public static int max(int a, int b)
    {
        return a>b?a:b;
    }
    public static int max3(int a, int b, int c)
    {
        int d = max(a,b);
//            d = max(d,c);
            return c>d?c:d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        int w = max3(x, y, z);
        System.out.println(w);
    }
}

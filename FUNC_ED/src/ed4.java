import java.util.Scanner;

public class ed4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int w = ed4f(x, y, z);
        System.out.println(w);
    }
    public static int ed4f(int a, int b, int c)
    {
        int max = ed3f(a, b);
            max = ed3f(max, c);
        return max;
    }
    private static int ed3f(int a, int b) {
        return a>b?a:b;
    }
}

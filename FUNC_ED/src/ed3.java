import java.util.Scanner;

public class ed3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = ed3f(x, y);
        System.out.println(z);
    }
    public static int ed3f(int a, int b)
    {
        return a>b?a:b;
    }
}

import java.util.Scanner;

public class ed1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = ed1f(x, y);
        System.out.println(z);
    }
    public static int ed1f(int a, int b)
    {
        int c = a + b;
        return c;
    }
}

import java.util.Scanner;

public class ED3
{
    public static int larger(int a, int b)
    {
        return a>b?a:b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z;
        z = larger(x, y);
        System.out.println(z);
    }
}

import java.util.Scanner;

public class F1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sum(x, y);
        System.out.println(z);
    }
    public static int sum(int a, int b)
{
    int r = a + b;
    return r;
}
}

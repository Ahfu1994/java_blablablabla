import java.util.Scanner;

public class ED5
{
    public static double ABS(double a)
    {
        return a<0?Math.abs(a):a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = ABS(x);
        System.out.println(y);
    }
}

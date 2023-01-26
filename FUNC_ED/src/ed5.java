import java.util.Scanner;

public class ed5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = ed5f(x);
        System.out.println(y);
    }
    public static double ed5f(double a)
    {
        if (a<0) return a*(-1);
        return a;
    }
}

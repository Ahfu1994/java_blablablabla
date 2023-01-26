import java.util.Scanner;

public class ed6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = ed6f(x);
        System.out.println(y);
    }
    public static int ed6f(int n)
    {
        int a=1;
        while(a*2<n)
        {
            a=a*2;
        }
        if(a*2==n) return n;
        return a;
    }
}

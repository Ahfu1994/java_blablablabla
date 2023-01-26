import java.util.Scanner;

public class ed9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = ed9f(n);
        System.out.println(x);
    }
    public static int ed9f(int a)
    {
        String b = ""+a;
        char x = b.charAt(0);
        int f = Integer.parseInt(String.valueOf(x));
        return f;
    }
}

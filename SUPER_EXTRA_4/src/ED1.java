import java.util.Scanner;

public class ED1
{
    public static int add(int a, int b)
    {
        int c;
        c = a+b;
        return c;
    }

    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = add(x,y);
        System.out.println(z);
    }
}

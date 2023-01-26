import java.util.Scanner;

public class ED2
{
    public  static void add(int a, int b, int[]c)
    {
         c[0] = a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        int[]z = new int[1];
        x = sc.nextInt();
        y = sc.nextInt();
        add(x, y, z);
        System.out.println(z[0]);
    }
}


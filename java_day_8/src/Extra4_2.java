import java.util.Scanner;

public class Extra4_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int []z = new int[1];
        sum(x, y, z);
        System.out.println(z[0]);
    }
    public static void sum(int a, int b, int []c)
    {
        c[0] = a + b;
    }
}

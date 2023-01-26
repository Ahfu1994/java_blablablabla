import java.util.Scanner;

public class ed2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []x = new int[3];
        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = x[0] + x[1];
        System.out.println(x[2]);
    }
    public static void ed2f(int []a)
    {
        a[2] = a[0]+a[1];
    }
}

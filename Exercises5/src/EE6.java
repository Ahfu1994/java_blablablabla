import java.util.Scanner;

public class EE6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        for (int i = m; i >=n ; i--) {
            System.out.print(i);
            if (i==n) break;
            System.out.print(",");
        }
    }
}

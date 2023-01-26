import java.util.Scanner;

public class EE9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        for (int i = n; i <=m ; i++) {
            System.out.print(i);
            if (i == m) break;
            System.out.print(",");
        }
    }
}

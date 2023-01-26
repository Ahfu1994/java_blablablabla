import java.util.Scanner;

public class ed7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = ed6f(x);
        System.out.println(y);

    }
    public static int ed6f(int a)
    {
        int count = 0;
        for (int i = 1; i < a; i++) {
            if (a%i == 0) {
                count++;
            }
        }
        if (count == 2) return 0;
        return 1;
    }
}

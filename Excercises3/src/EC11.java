import java.util.Arrays;
import java.util.Scanner;

public class EC11
{
    public static void main(String[] args) {
        int a, b, c;
        int []x = new int[4];
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = x.length-1; i >= 0 ; i--) {
            b = a%10;
            a = a/10;
            x[i] = b;
        }
        System.out.println(Arrays.toString(x));
    }
}

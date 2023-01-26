import java.util.Arrays;
import java.util.Scanner;

public class EC5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        int V = sc.nextInt();
        int index = sc.nextInt();
        for (int i = x.length-1; i > index ; i--) {
            x[i] = x[i-1];
        }
        x[index] = V;
        System.out.println(Arrays.toString(x));
    }
}

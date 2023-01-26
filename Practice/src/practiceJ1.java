import java.util.Arrays;
import java.util.Scanner;

public class practiceJ1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
    }
}

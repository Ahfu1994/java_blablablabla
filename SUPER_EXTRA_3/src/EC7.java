import java.util.Arrays;
import java.util.Scanner;

public class EC7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[10];
        for (int i = 0; i <a.length ; i++) {
            a[i] = sc.nextInt();
        }
        int []b = new int[10];
        for (int i = 0; i <b.length ; i++) {
            b[i] = sc.nextInt();
        }
        int []c = new int[20];
        for (int i = 0; i <a.length ; i++) {
            c[i] = a[i];
            c[i+10] = b[i];
        }
        System.out.println(Arrays.toString(c));
    }
}

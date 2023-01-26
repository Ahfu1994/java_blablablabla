import java.util.Arrays;
import java.util.Scanner;

public class EC9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In put size of arrays A :");
        int n = sc.nextInt();
        int []a = new int[n];
        System.out.println("In put integer in arrays A("+n+"):");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("In put size of arrays B :");
        int m = sc.nextInt();
        int []b = new int[m];
        System.out.println("In put integer in arrays B("+m+"):");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int []c = new int[a.length-b.length+1];
        int sum;
        for (int i = 1; i <c.length ; i++) {
            sum = 0;
            for (int j = 0; j < b.length; j++) {
                sum = sum + b[j] * a[j + i - 1];
            }
            System.out.print(sum);
            c[i-1] = sum;
        }
        System.out.println("\n");
        System.out.println(Arrays.toString(c));
    }
}

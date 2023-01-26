import java.util.Arrays;
import java.util.Scanner;

public class EC8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[]a = new int[]{1, 2, 1, 3, 8, 5, 4, 6, 8, 4, 2, 5, 6, 1, 2 ,1, 0, 0, 1 ,0};
        int[]a = new int[]{1, 2, 3};
        int[]b = new int[]{2};
        int[]c = new int[1];

        int i, j;
        int sum;
        for ( i = 1; i < a.length-1; i++) {
            sum = 0;
            for ( j = 0; j <b.length ; j++) {
                sum = sum +b[j]*a[i+j-1];
            }
            System.out.print(sum);
//            c[i] = sum;
        }
//        System.out.println(Arrays.toString(c));
    }
}

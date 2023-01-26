import java.util.Arrays;
import java.util.Scanner;

public class EH8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
//        for (int i = 0; i < x.length; i++) {
//            System.out.print(x[i]);
//        }
        System.out.println(x[x.length-2]);
    }
}


import java.util.Arrays;
import java.util.Scanner;

public class EC12
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []x = new int[5];
        for (int i = 0; i <x.length ; i++) {
            x[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(x));
        int t = x[0];
        for (int i = 0; i <x.length-1 ; i++) {
            x[i] = x[i+1];
        }
        x[x.length-1] = t;
        System.out.println(Arrays.toString(x));
    }
}

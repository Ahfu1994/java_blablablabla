import java.util.Arrays;
import java.util.Scanner;

public class practiceJ3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x = new int[10];
        for (int i = 0; i < x.length ; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        double mod;
        if(x.length%2 == 0) {
            mod = (x[x.length/2-1]+x[x.length/2])/2.0;
            System.out.println(mod);
        }
        else{
//            mod = x[x.length/2-1];
//            System.out.println(mod);
        }

    }
}

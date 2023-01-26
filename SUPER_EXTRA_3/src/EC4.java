import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class EC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
//        System.out.println("Input V : ");
        int V = sc.nextInt();
        int index = -1;
        for (int i = 0; i < x.length; i++) {
            if(x[i]==V){
                index = i;
                break;
            }
        }
        if(index != -1){
            for (int i = index; i <x.length-1 ; i++) {
                x[i] = x[i+1];
            }
            x[x.length-1] = 0;
        }
        System.out.println(Arrays.toString(x));
    }
}

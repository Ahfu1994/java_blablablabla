import java.util.Arrays;
import java.util.Scanner;

public class EE13
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]x = new int[n][5];
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                x[i][j] = sc.nextInt();
//                System.out.print(x[i][j]);
            }
        }
        //sum per student and avg. per student
        for (int i = 0; i <x.length ; i++) {
            int sum = 0;
            double avg;
            for (int j = 0; j <x[0].length ; j++) {
//                System.out.print(x[i][j]);// show the Integer in arrays
                sum = sum +x[i][j];
            }
            avg = (double)sum/x[0].length;
//            System.out.println(sum+"\t");
            System.out.println(avg);
        }
        //sum per round and avg per round
        for (int i = 0; i < x[0].length ; i++) {
            int sum = 0;
            double avg;
            for (int j = 0; j <x.length; j++) {
                sum = sum +x[j][i];
            }
            avg = (double)sum/ x.length;
//            System.out.println(sum+"\t");
            System.out.println(avg);
        }
    }
}

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class EF7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long Number = sc.nextInt();
        int []Old_Number = new int[9];
        for (int i = Old_Number.length-1; i >=0 ; i--) {
            Old_Number[i] = (int)(Number%10);
            Number = Number/10;
        }
//        System.out.println(Arrays.toString(Old_Number));
       int sum1 = 0;
        for (int i = 2; i <=10 ; i++) {
            sum1 = Old_Number[Old_Number.length+1-i]*i + sum1;
        }
        int Digit_Check = 11-sum1%11;
//        System.out.println(Digit_Check);
        int []New_Number = new int[10];
        for (int i = 0; i < Old_Number.length ; i++) {
            New_Number[i] = Old_Number[i];
        }
        New_Number[9] = Digit_Check;
//        System.out.println(Arrays.toString(New_Number));
         long sum_New_Number = 0;
        for (int i = 0; i < New_Number.length; i++) {
            sum_New_Number = sum_New_Number*10 + New_Number[i];
        }
//        System.out.println(sum_New_Number);
        DecimalFormat df = new DecimalFormat("0000000000");
        System.out.println(df.format(sum_New_Number));
    }
}

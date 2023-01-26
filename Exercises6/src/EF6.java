import java.util.Arrays;
import java.util.Scanner;

public class EF6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Old_Number = new int[10];
        int[] Number = new int[]{9, 7, 8};
        int[] New_Number = new int[13];
        for (int i = 0; i < Old_Number.length; i++) {
            Old_Number[i] = sc.nextInt();
        }
        // Add 2 arrays together
        for (int i = 0; i < Number.length; i++) {
            New_Number[i] = Number[i];
        }
        for (int i = 0; i < Old_Number.length; i++) {
            New_Number[i + 3] = Old_Number[i];
        }
        int sum1, sum2, sum;
        sum1 = 0;
        sum2 = 0;
        for (int i = 1; i < New_Number.length - 1; i = i + 2) {
            sum1 = New_Number[i - 1] + sum1;
            sum2 = New_Number[i] * 3 + sum2;
        }
        System.out.println(sum1);
        System.out.println(sum2);
        sum = sum1 + sum2;
        System.out.println(sum);
        int Check_Digit = 10 - sum % 10;
        New_Number[12] = Check_Digit;
//        System.out.println(Arrays.toString(New_Number));
        for (int i = 0; i <New_Number.length ; i++) {
            System.out.print(New_Number[i]);
        }
    }
}

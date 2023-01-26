import java.util.Arrays;
import java.util.Scanner;

public class EF6_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  Number = sc.nextLong();
//        System.out.println(Number);
        int []Old_Number = new int[10];
        int []New_Number = new int[13];
        int []Prefix_Number = new int[]{9,7,8};
        //Input a Integer in Old_Number Arrays
        for (int i = Old_Number.length-1; i >=0 ; i--) {
            Old_Number[i] = (int) (Number%10);
            Number = Number/10;
        }
//        System.out.println(Arrays.toString(Old_Number)); //Show the integer in each arrays
        //Add 2 Arrays(Old_Number, Prefix_Number) into New_Number
        for (int i = 0; i < Prefix_Number.length ; i++) {
            New_Number[i] = Prefix_Number[i];
        }
        for (int i = 0; i < Old_Number.length ; i++) {
            New_Number[i+3] = Old_Number[i];
        }
//        System.out.println(Arrays.toString(New_Number));// Check the Integer in each New_Number Arrays after add Prefix_Number and Old_Number together
        int sum, sum1,sum2;
        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i <New_Number.length-1 ; i++) {
            if (i%2 == 0)
            {
                sum1 = New_Number[i] + sum1;
            }
            else
            {
                sum2 = New_Number[i]*3+sum2;
            }
        }
        sum = sum1 + sum2;
//        System.out.println(sum1+"\n"+sum2); //Check Sum of Sum1 that the index cant mod 2 equal 0 and the Sum2 that the index mod 2 equal 0
//        System.out.println(sum); //
        int Digit_Check = 10-sum%10;
//        System.out.println(Digit_Check); //Check the Integer of Digit_Check
        New_Number[New_Number.length-1] = Digit_Check;
//        System.out.println(Arrays.toString(New_Number)); //Check the Integer in each Arrays of New_Number Arrays after changed Integer in index 13
        long Sum_New_Number = 0;
        for (int i = 0; i <New_Number.length ; i++) {
            Sum_New_Number = Sum_New_Number*10+New_Number[i];
//            System.out.println(Sum_New_Number);//Check Sum_New_Number each digit
        }
        System.out.println(Sum_New_Number);
    }
}

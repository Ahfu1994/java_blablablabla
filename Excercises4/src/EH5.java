import java.util.Scanner;

public class EH5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum, count;
        sum = 0;
        count = 0;
        double avg;
        while(true)
        {
            n = sc.nextInt();
            if (n == 0) break;
            sum = sum + n;
            count++;
        }
        avg = (double)sum/count;
        System.out.println(sum);
//        System.out.println(count);
        System.out.println(avg);
    }
}

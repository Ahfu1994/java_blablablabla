import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ED7
{
    public static int PrimeNumber(int a)
    {
        int count =0;
        for (int i = 1; i <= a; i++) {
            if (a%i == 0){
                count ++;
            }
        }
        if(count >= 2) return 0;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = PrimeNumber(x);
        System.out.println(a);
    }
}

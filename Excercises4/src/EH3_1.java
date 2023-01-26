import java.util.Scanner;

public class EH3_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m;
        int sum = 0;
        while(true)
        {
            m = n%10;
//            System.out.print(m+"\t");
            n = n/10;
            sum = sum+m;
//           System.out.println(sum);
            if(n==0) break;
        }
        System.out.println(sum);
    }
}

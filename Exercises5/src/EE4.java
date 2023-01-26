import java.util.Scanner;

public class EE4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m, revers;
        revers = 0;
        while (n>0)
        {
            m = n%10;
            revers = revers*10+m;
            n = n/10;
        }
        System.out.println(revers);
    }
}

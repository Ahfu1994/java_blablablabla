import java.util.Scanner;

public class EH2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double x = sc.nextInt();
               x = x/100;
        double r = x+1;
        double p = 0;
        double w = 0;
        int i = 1;
        while(i<=10)
        {
            w = (p+c)*r;
            p = w;
//            System.out.println(w);
            i++;
        }
        System.out.println(w);
    }
}

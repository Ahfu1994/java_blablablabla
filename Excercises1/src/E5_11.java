import java.util.Scanner;

public class E5_11
{
    public static void main(String[] args) {
        int a1, b1, a2, b2, c1, c2;
        double x, y;
        Scanner sc = new Scanner(System.in);
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        c1 = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        c2 = sc.nextInt();
        y = (double)(a1*c2 - a2*c1)/(a1*b2 -a2*b1);
        x = (double)(c1-b1*y)/a1;
        System.out.println(x+"\n"+y);
    }
}

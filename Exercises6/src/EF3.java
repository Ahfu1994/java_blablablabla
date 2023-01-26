import java.util.Scanner;

public class EF3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int h, m;
        if (h2 < h1)
        {
            h = 11 + h2 - h1;
            if (m1 >= 0 || m2 >= 0)
            {
                m = 60 + m2 - m1;
                if (m == 60)
                {
                    m = 0;
                    h = h + 1;
                    System.out.println(h);
                    System.out.println(m);
                } else if (m < 60 && m > 0)
                {
                    m = m;
                    h = h - 1;
                    System.out.println(h);
                    System.out.println(m);
                }
            }
            else if (m1 == 0 && m2 == 0)
            {
                m = 0;
                h = h;
                System.out.println(h);
                System.out.println(m);
            }
        }
        else if (h2 > h1)
        {
            h = h2 - h1;
            if (m1 > 0 || m2 > 0)
            {
                m = 60 + m2 - m1;
                if (m == 60)
                {
                    m = 1;
                    h = h + m;
                    System.out.println(h);
                    System.out.println(m);
                } else if (m < 60 && m > 0)
                {
                    m = m;
                    h = h - 1;
                    System.out.println(h);
                    System.out.println(m);
                }
            } else if (m1 == 0 && m2 == 0)
            {
                m = 0;
                h = h;
                System.out.println(h);
                System.out.println(m);
            }
        }
    }
}

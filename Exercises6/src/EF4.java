import java.util.Scanner;

public class EF4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, m ,y ;
//        int[]x = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        d = sc.nextInt();
        m = sc.nextInt();
        y = sc.nextInt();
        y = y - 543; //change to AD.
//        System.out.println(y);
        if(y%4==0)//the year has %4 equal 0 ,that has February 29 days
        {
            if (m==1)
            {
                d = d;
                System.out.println(d);
            }
            else
            {
                int sum = 0 ;
                int[] x = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                for (int i = 0; i < m - 1; i++)
                {
                    d = x[i]+d;//find the day of the year
                }
                System.out.println(d);
            }
        }
        else
        {
            if (m==1)
            {
                d = d;
                System.out.println(d);
            }
            else
            {
                int[] x = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                for (int i = 0; i < m - 1; i++)
                {
                    d = x[i]+d;//find the day of the year
                }
                System.out.println(d);
            }
        }
    }
}

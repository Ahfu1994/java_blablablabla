import java.util.Scanner;

public class EB11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum, count, avg;
        count =0;
        sum = 0;
        while(true)
        {
            n = sc.nextInt();
            if(n<0)
            {
                System.out.println("ERROR");
                continue;
            }
            else
            {
                if(n==0)
                {
                    if (count==0)
                    {
                        System.out.println("NO AVERAGE");
                        break;
                    }
                    else
                    {
                        avg = sum/count;
                        System.out.println(avg);
                        break;
                    }
                }
                else
                {
                    sum = sum + n;
                    count = count + 1;
                    continue;
                }
            }
        }
    }
}

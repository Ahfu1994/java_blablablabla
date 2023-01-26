import java.util.Scanner;

public class EH3_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m;
        int sum = 0;
        int count1 = 0;
        int count2 = 0;
        while(true)
        {
            m = n%10;
            if(m%2==0)
            {
                count1++; // count even number
            }
            else if (m!=0 && m%2!=0)
            {
                count2++; // count odd number
            }
//            System.out.print(m+"\t");
            n = n/10;
            sum = sum+m;
//           System.out.println(sum);
            if(n==0) break;
        }
//        System.out.println(sum);
        System.out.println(count1+"\n"+count2);
    }
}

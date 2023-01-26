import java.util.Scanner;

public class EH10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int Odd_Sum = 0;
        int Even_Sum = 0;
        while(true)
        {
            a = sc.nextInt();
            if (a == 0) break;
            else if (a<0)
            {
                Odd_Sum = Odd_Sum+a;
            }
            else if(a>0)
            {
                Even_Sum = Even_Sum+a;
            }
        }
        System.out.println(Even_Sum);
        System.out.println(Odd_Sum);
    }
}

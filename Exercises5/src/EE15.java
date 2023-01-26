import java.util.Scanner;

public class EE15
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++)
        {
            //spacer
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print("\t");
            }
            //number
            int number = 1;
            for (int k = 0; k <=i ; k++) {
                if (k < i) {
                    System.out.print(number+"\t\t");
                }
                if (k==i)
                {
                    System.out.print(number+"\n");
                }
                number = number*(i-k)/(k+1);
            }
        }
    }
}

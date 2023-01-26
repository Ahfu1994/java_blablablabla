import java.util.Scanner;

public class EH11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int Odd_Sum = 0;
        int Even_Sum = 0;
        int Odd_Count = 0;
        int Even_Count = 0;
        double Odd_Avg, Even_Avg;
        while(true)
        {
            a = sc.nextInt();
            if (a == 0) break;
            else if (a<0)
            {
                Odd_Sum = Odd_Sum+a;
                Odd_Count++;
            }
            else if(a>0)
            {
                Even_Sum = Even_Sum+a;
                Even_Count++;
            }
        }
        Odd_Avg = (double) Odd_Sum/Odd_Count;
        Even_Avg = (double) Even_Sum/Even_Count;
//        System.out.println(Even_Sum);
//        System.out.println(Odd_Sum);
        System.out.println(Even_Avg+"\n"+Odd_Avg);
    }
}

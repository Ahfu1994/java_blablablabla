import java.util.Scanner;

public class EF1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x = new int[4];
        for (int i = 0; i <x.length ; i++) {
            x[i] = sc.nextInt();
        }
        //find min
        double min = Integer.MAX_VALUE;
        for (int i = 0; i <x.length ; i++) {
            if(x[i]<min)
            {
                min = x[i];
            }
        }
        //calculate sum
        double sum = 0;
        for (int i = 0; i <x.length ; i++) {
            sum = sum +x[i];
        }
        double promo = sum - min;
        System.out.println(sum+"\n"+promo);
    }
}

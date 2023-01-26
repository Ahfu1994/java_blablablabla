import java.util.Scanner;

public class EE10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x = new int[10];
        for (int i = 0; i <x.length ; i++) {
            x[i] = sc.nextInt();
        }
        double max = Integer.MIN_VALUE;
        for (int i = 0; i <x.length ; i++) {
            if(x[i]>max)
            {
                max = x[i];
            }
        }
        double min = Integer.MAX_VALUE;
        for (int i = 0; i <x.length ; i++) {
            if (x[i]<min)
            {
                min = x[i];
            }
        }
        double sum = 0;
        for (int i = 0; i <x.length ; i++) {
            sum = sum +x[i];
        }
        double avg;
        avg = (double)sum/x.length;

        System.out.println(max+"\n"+min+"\n"+avg);
    }
}

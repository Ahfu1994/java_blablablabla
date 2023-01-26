import java.util.Scanner;

public class EE11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]x = new int[n];
        for (int i = 0; i <x.length ; i++) {
            x[i] = sc.nextInt();
        }
        double max, min, avg;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        double sum = 0;
        for (int i = 0; i <x.length ; i++) {
            if(x[i]>max)
            {
                max = x[i];
            }
        }
        for (int i = 0; i <x.length ; i++) {
            if (x[i]<min)
            {
                min = x[i];
            }
        }
        for (int i = 0; i <x.length ; i++) {
            sum = sum +x[i];
        }
        avg = sum /x.length;

        System.out.println(max+"\n"+min+"\n"+avg);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class EH14
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x = new int[3];
        for (int i = 0; i <x.length ; i++) {
            x[i] = sc.nextInt();
        }
        int a = max(x);
        int b = min(x);
        ArraySort(x);
        System.out.println(a+"\n"+b);
        System.out.println(Arrays.toString(x));
    }
    private static int max(int[]a){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        return max;
    }
    private static int min(int[]a){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        return min;
    }
    private static void ArraySort(int[]a){
        for (int j = 0; j <a.length; j++) {
            for (int i = 0; i <a.length-1-j; i++) {
                if(a[i]>a[i+1])
                {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
    }
}

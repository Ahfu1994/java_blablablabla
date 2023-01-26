import java.util.Scanner;

public class EH12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        int b = Odd_Max(x);
        int c = Odd_Min(x);
        int d = Even_Max(x);
        int e =Even_Min(x);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }

    private static int Odd_Max(int[]a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0 && a[i] != 0) {
                if (a[i]>max)
                {
                    max = a[i];
                }
            }
        }
        return max;
    }
    private static int Odd_Min(int[]a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]%2 != 0 && a[i] != 0)
            {
                if (a[i]<min)
                {
                    min = a[i];
                }
            }
        }
        return min;
    }
    private static int Even_Max(int[]a){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]%2==0 || a[i]==0)
            {
                if (a[i]>max)
                {
                    max = a[i];
                }
            }
        }
        return max;
    }
    private static int Even_Min(int[]a){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]%2==0 || a[i]== 0)
            {
                if (a[i]<min)
                {
                    min = a[i];
                }
            }
        }
        return min;
    }
}
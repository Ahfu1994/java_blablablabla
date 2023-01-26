import java.util.Arrays;
import java.util.Scanner;

public class practiceH2 {
    public static void main(String[] args)
    {
        int x[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<x.length; i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0; i<x.length; i++){
        System.out.println(x[i]);
        }
    }
}

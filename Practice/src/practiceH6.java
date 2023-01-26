import java.util.Scanner;

public class practiceH6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[10];
        for (int i=0; i<x.length; i++)
        {
            x[i]=sc.nextInt();
        }
        int sum =0;
        for(int j=0; j<x.length; j++)
        {
            sum = sum+x[j];
        }
        System.out.println(sum);
    }
}

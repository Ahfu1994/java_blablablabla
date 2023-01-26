import java.util.Scanner;

public class practiceH8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[10];
        for(int i=0; i<x.length; i++)
        {
            x[i]=sc.nextInt();
        }
        double sum, avg;
        sum=0;
        for(int j=0; j<x.length; j++)
        {
            sum+=x[j];
        }
        avg=sum/x.length;
        System.out.println(avg);
    }
}

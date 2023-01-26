import java.util.Scanner;

public class practiceH10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[10];
        for(int i=0; i<x.length; i++)
        {
            x[i]=sc.nextInt();
        }
        int min;
        min=Integer.MAX_VALUE;
        for(int j=0; j<x.length; j++)
        {
            if (x[j]<min)
            {
                min=x[j];
            }
        }
        System.out.println(min);
    }
}

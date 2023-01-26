import java.util.Scanner;

public class practiceH5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[10];
        for(int i=0; i<x.length; i++)
        {
            x[i]=sc.nextInt();
        }
        int sum = 0;
        for (int i=0; i<x.length; i++)
        {
            if(x[i]%2==0)
            {
                sum+=1;
            }
            else
            {

            }
        }
        System.out.println(sum);
    }
}

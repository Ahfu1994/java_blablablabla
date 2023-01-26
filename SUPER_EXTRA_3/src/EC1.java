import java.util.Scanner;

public class EC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x=new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i]= sc.nextInt();
        }
        int count=0;
        for (int j=0; j<x.length; j++) {
            if (x[j]>=10) {
                count=count+1;
            }
            else {

            }
        }
        System.out.println(count);
    }
}

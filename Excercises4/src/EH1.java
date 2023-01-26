import java.util.Scanner;

public class EH1
{
    public static void main(String[] args) {
        double n = 500;
        double r = 1.03;
        int count = 0;
        double p;
        while(true) {
            p = (n * r);
            if (p < 20000) {
                count++;
            }
            if (p > 20000) {
                System.out.println(count);
                break;
            }
            n = (int)p;
        }
    }
}

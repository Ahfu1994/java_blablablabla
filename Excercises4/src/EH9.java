import java.util.Scanner;

public class EH9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double []x = new double[5];
        for (int i = 0; i <x.length ; i++) {
            x[i] = sc.nextDouble();
        }
        double all_sum = sum(x);
        double AVG = avg(x);
        System.out.println(all_sum);
        System.out.println(AVG);
    }
    public static double sum(double []a) {
        double s = 0;
        for (int i = 0; i <a.length ; i++) {
            s = s + a[i];
        }
        return s;
    }
    public static double avg(double []a){
        double avg = sum(a)/a.length;
        return avg;
    }

}

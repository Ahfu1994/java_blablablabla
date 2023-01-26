import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class EC6 {
    public static void main(String[] args) {
        Integer[] x = new Integer[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        //Bubble sort method
        for (int j = 0; j < x.length; j++) {
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] < x[i + 1]) {
                    int t = x[i];
                    x[i] = x[i+1];
                    x[i+1] = t;
                }
            }
        }
        //Selection sort method
//        int min;
//        for (int i = 0; i < x.length; i++) {
//             min = Integer.MAX_VALUE;
//            int min_index = -1;
//            for (int j = 0; j < x.length-i ; j++) {
//                if(x[i]<min){
//                    min = x[i];
//                    min_index = i;
//                }
//                int temp = x[x.length-i-1];
//                    x[x.length-i-1] = x[min_index];
//                    x[min_index] = temp;
//            }
//        }
        System.out.println(Arrays.toString(x));
    }
}

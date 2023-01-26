import java.util.Scanner;

public class practiceJ4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]x = new int[10];
        for (int i = 0; i < x.length ; i++) {
            x[i] = sc.nextInt();
        }
        int Count = 0;
        int Element = 0;
        for (int i = 0; i < x.length; i++) {
            int tempElement = x[i];
            int tempCount = 0;
            for (int j = 0; j <= x.length-1; j++) {
                if(x[j]==tempElement) {
                  tempCount++;
                }
                if (tempCount > Count) {
                    Element = tempElement;
                    Count = tempCount;
                }
            }
//            System.out.println(Element+"\n"+Count);
        }
        System.out.println(Element+"\n"+Count);
    }
}

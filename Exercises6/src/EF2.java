import java.util.Scanner;

public class EF2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <500; i++) {
            int a = i;
            for (int j = i+1; j <500 ; j++) {
                int b = j;
                if (b != a)
                {
                    for (int k = j+1; k <500 ; k++) {
                        int c = k;
                        if (c != a && c != b)
                        {
                            int r = (int) (Math.pow(a, 2) + Math.pow(b, 2));
                            int s = (int) Math.pow(c, 2);
                            if (s == r)
                            {
                                System.out.println(a+", "+b+", "+c);
                            }
                        }
                    }
                }

            }

        }
    }
}

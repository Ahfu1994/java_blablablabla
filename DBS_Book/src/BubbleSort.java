import java.util.Arrays;

public class BubbleSort
{
    public static int[] Bubble(int[]a)
    {
        for (int i = 0; i < a.length ; i++)
        {
            for (int j = 0; j <a.length-1-i ; j++)
            {
                if (a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args)
    {
        int []a = new int[10];
        for (int i = 0; i < a.length ; i++)
        {
            a[i] = (int)(Math.random()*100);
        }

        System.out.println(Arrays.toString(a));
        Bubble(a);
        System.out.println(Arrays.toString(a));
    }
}

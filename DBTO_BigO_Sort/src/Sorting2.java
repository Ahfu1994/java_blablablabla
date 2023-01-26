import java.util.Arrays;

public class Sorting2
{
    public static int[] insectionSort(int[]a)
    {
        int i,j,key,temp;
        for (i = 1; i <a.length ; i++)
        {
            j = i-1;
            key = a[i];
            for (; j >=0 && key <a[j] ; j--)
            {
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
        return a;
    }
    public static void main(String[] args)
    {
        int[] a = new int[10000];
        for (int i = 0; i <a.length ; i++)
        {
            a[i] = (int)(Math.random()*1000);
        }
        long x1,x2;
        System.out.println(Arrays.toString(a));
        x1 = System.currentTimeMillis();
        insectionSort(a);
        x2 = System.currentTimeMillis();
        System.out.println(Arrays.toString(a));
        System.out.println(x2-x1);
    }
}

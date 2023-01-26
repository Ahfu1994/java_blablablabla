import java.util.Arrays;

public class Sorting
{
    public static int[] bubbleSort(int[]a)
    {
        for (int i = 0; i <a.length ; i++)
        {
            for (int j = 0; j <a.length-i-1; j++)
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
    public static int[] selectionSort(int[]a)
    {

        for (int j = 0; j <a.length ; j++)
        {
            int max_index = 0;
            int max = Integer.MIN_VALUE;
            int last = a.length-j-1;
            for (int i = 0; i <=last; i++)
            {
                if (a[i] > max) {
                    max = a[i];
                    max_index = i;
                }
            }
            int temp = a[last];
            a[last] = max;
            a[max_index] = temp;
        }
        return a;
    }
    public static int[] selectionSort2(int[]a)
    {
        int i , j, minValue, minIndex, temp = 0;
        for ( i = 0; i <a.length ; i++)
        {
            minValue = Integer.MAX_VALUE;
            minIndex = 0;
            for ( j = i; j <a.length ; j++)
            {
                if (a[j] < minValue)
                {
                    minValue = a[j];
                    minIndex = j; // จำตำแหน่งของ index ที่น้อยไว้ด้วย สำหรับใช้สลับตำแหน่ง
                }
            }
            if (minValue < a[i])
            {
                temp = a[i];
                a[i] = minValue;
                a[minIndex] = temp;
            }
        }
        return a;
    }
    public static void insertionSort(int[] a)
    {
        for (int i = 1; i <a.length ; i++)
        {
            int temp = a[i];
            int j=i;
            for ( j = i; j >0 && a[j-1]>temp ; j--)
            {
                a[j] = a[j-1];
                a[j] = temp;
            }
//            a[j+1] = temp;
        }
//        return a;
    }
    public static int[] insertionSort2(int[]a)
    {
        int i, j, key, temp ;
        for (i = 1 ; i<a.length ; i++)
        {
            key = a[i];
            j = i-1;
            while ( j>=0 && key <a[j])
            {
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                j--;
            }
        }
        return a;
    }
    public static void mergeSort(int[]a, int l, int r)
    {
        if (l == r)
        {
            return;
        }
        int m = (l+r)/2;
        mergeSort(a, l, m);
        mergeSort(a, m+1, r);
        int[] b = new int[r-l+1];
        int k =0;
        int i = l;
        int j = m+1;
        while(i <= m && j<=r)
        {
            if (a[i] < a[j])
            {
                b[k] = a[k];
                k++; i++;
            }
            else
            {
                b[k] = a[j];
                k++; j++;
            }
        }
        while (i<=m)
        {
            b[k] = a[i];
            k++;i++;
        }
        while(j<=r)
        {
            b[k] = a[j];
            k++;j++;
        }
        i = l;
        k = 0;
        for (; i <= r ; i++)
        {
            a[i] = b[k];
            k++;
        }
    }
    public static void quickSort(int[]a, int l, int r)
    {
        if (l >= r)
        {
            return;
        }
        int temp = a[l];
        int i = l;
        int j = r+1;
        while (i<j)
        {
            do
            {
                j--;
            }
            while (temp < a[j]);
            i++;
            if (i < j)
            {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t2 = a[j];
        a[j] = a[l];
        a[l] = t2;
        quickSort(a, l, j-1);
        quickSort(a, j+1, r);
    }

    public static void main(String[] args)
    {
        int [] n = new int[10000];
        for (int i = 0; i <n.length ; i++)
        {
            n[i] = (int) (Math.random()*1000);
        }
        long x1, x2;
        x1 = System.currentTimeMillis();
       bubbleSort(n);
        x2 = System.currentTimeMillis();
        System.out.println("Runtime : "+(x2-x1)+" milliseconds");

        for (int i = 0; i <n.length ; i++)
        {
            n[i] = (int) (Math.random()*1000);
        }
        x1 = System.currentTimeMillis();
        selectionSort2(n);
        x2 = System.currentTimeMillis();
        System.out.println("Runtime : "+(x2-x1)+" milliseconds");

        for (int i = 0; i <n.length ; i++)
        {
            n[i] = (int) (Math.random()*1000);
        }
        x1 = System.currentTimeMillis();
        insertionSort2(n);
        x2 = System.currentTimeMillis();
        System.out.println("Runtime : "+(x2-x1)+" milliseconds");

        for (int i = 0; i <n.length ; i++)
        {
            n[i] = (int) (Math.random()*1000);
        }
        x1 = System.currentTimeMillis();
        mergeSort(n, 0, n.length-1);
        x2 = System.currentTimeMillis();
        System.out.println("Runtime : "+(x2-x1)+" milliseconds");

        for (int i = 0; i <n.length ; i++)
        {
            n[i] = (int) (Math.random()*1000);
        }
        x1 = System.currentTimeMillis();
        quickSort(n, 0, n.length-1);
        x2 = System.currentTimeMillis();
        System.out.println("Runtime : "+(x2-x1)+" milliseconds");

    }
}

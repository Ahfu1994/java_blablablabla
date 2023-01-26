public class IntArrays
{
    private static java.util.Random random = new java.util.Random();

    public static boolean isSorted(int[]a )
    {
        for (int i = 1; i <a.length ; i++)
        {
            if (a[i]<a[i-1])
            {
                return false;
            }
        }
        return true;
    }

    public static int[] print(int[]a)
    {
        System.out.print("{"+a[0]);
        for (int i = 1; i <a.length ; i++)
        {
            System.out.print(","+a[i]);
        }
        System.out.println("}");
        return a;
    }
    public static int[] randomlnts(int n, int range) throws IllegalAccessException
    {
        if (n<0 || range<2) throw new IllegalAccessException();
        int []a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = random.nextInt(range);
        return a;
    }

    public static int[] resize(int[]a, int n) throws IllegalAccessException
    {
        if (n<a.length) throw new IllegalAccessException();
        int[]aa = new int[n];
        System.arraycopy(a, 0, aa, 0, a.length);
        return aa;
    }

    public static void swap(int[]a, int i, int j)
    {
        int ai = a[i], aj = a[j];
        if (ai == aj) return;
        a[i] = aj;
        a[j] = ai;
    }

    public static void main(String[] args)
    {
        int []a = {2,1,3,4,5,7,8,5,9,10};
        System.out.println(isSorted(a));
        System.out.println(print(a));
    }

}

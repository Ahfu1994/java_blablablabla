public class RT2
{
    public static void main(String[] args)
    {
        int n = 10;
        System.out.println(fac(n));
        System.out.println(fac2(n));
    }
    public static int fac(int n)
    {
        if (n == 0 ) return 1;
        int fac = fac(n-1);
        return fac*n;
    }
    public static int fac2(int n)
    {
        int fac = 1;
        for (int i = 1; i <=n; i++)
        {
            fac = fac*i;
        }
        return fac;
    }
}

public class RT4
{
    public static void main(String[] args)
    {
        System.out.println(powerMod1(2, 50, 73));
        System.out.println(powerMod2(2, 50, 73));
        System.out.println(powerMod3(2, 50, 73));
    }
    public static int powerMod1(int a, int k, int m)
    {
        int p =1;
        for (int i = 0; i < k; i++)
        {
            p =(p*a)%m;
        }
        return p;
    }
    public static int powerMod2(int a, int k, int m)
    {
        if (k == 0) return 1;
        int p = powerMod2(a, k-1, m);
        return (a*p)%m;
    }
    public static int powerMod3(int a, int k, int m)
    {
        if (k == 0) return 1;
        int p = powerMod3(a, k/2, m);
        p = p*p%m;
        if (k%2 == 1) p = (p*a)%m;
        return p;
    }
}

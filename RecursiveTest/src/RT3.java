public class RT3
{
    public static void main(String[] args)
    {
        int n = 10;
        System.out.println(fibo(n));
        System.out.println(fibo2(n));
    }
    public static int fibo(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int f = fibo(n-1)+fibo(n-2);
        return f;
    }

    public static int fibo2(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int fk1 = 0, fk2 = 1, fk = 0;
        for (int i = 2; i <=n ; i++)
        {
            fk = fk1+fk2;
            fk1 = fk2;
            fk2 = fk;
        }
        return fk;
    }
}

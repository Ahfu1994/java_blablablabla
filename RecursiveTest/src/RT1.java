public class RT1
{
    public static void main(String[] args)
    {
        int n = 22000 ;
//        jeng3(n);
        sumN(n);
        sumN2(n);
        sumN3(n);
        System.out.println(sumN(n));
        System.out.println(sumN2(n));
        System.out.println(sumN3(n));
    }
    public static void jeng3(int n)
    {
        if (n<0) return; //Base case
        System.out.println(n);// Normal case
        jeng3(n-1);
    }
    public static int sumN(int n)
    {
        return (n*(n+2)/2);
    }
    public static int sumN2(int n)
    {
        int sum = 0;
        for (int i = 1; i <=n ; i++)
        {
            sum = sum +i;
        }
        return sum;
    }
    public static int sumN3(int n)
    {
        if (n == 0) return 0;
        return sumN3(n-1)+ n;
    }
}

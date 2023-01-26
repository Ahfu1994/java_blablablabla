public class Recursive_Test
{
    public  static long fac1(int n)
    {
        long r = 1;
        for (int i = 1; i <=n ; i++)
        {
            r= r*i;
        }
        return r;
    }
    public static long fac2(int n)
    {
        if (n == 0 || n == 1) return 1;
        return n*fac2(n-1);
    }
    public static void main(String[] args)
    {
//        System.out.println(fac1(10));
//        System.out.println(fac2(10));
        long start, stop;
        start = System.currentTimeMillis();
        for (int j = 0; j <=100 ; j++) {

            for (int i = 0; i <= 1000; i++) {
                fac1(i);
            }
        }
        stop = System.currentTimeMillis();
        System.out.println(stop-start);
        start = System.currentTimeMillis();
        for (int j = 0; j <=100 ; j++) {
            for (int i = 0; i <= 1000; i++) {
                fac2(i);
            }
        }
        stop = System.currentTimeMillis();
        System.out.println(stop-start);
    }
}

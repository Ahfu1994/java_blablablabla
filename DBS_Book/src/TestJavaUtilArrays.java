import java.util.Arrays;

public class TestJavaUtilArrays
{
    public static void main(String[] args)
    {
        int[]a = {66, 44, 99, 33, 55, 22, 88, 77};
        print(a);
        java.util.Arrays.sort(a);
        print(a);
        test(a,55);
        test(a,60);
        test(a,88);
        test(a,90);
        print(a);

    }
    static void test(int[] array, int target)
    {
        int i = java.util.Arrays.binarySearch(array, target);
        System.out.print("target = "+target+", i = "+i);
        if (i >= 0) System.out.println("\ta["+i+"] = "+array[i]);
        else System.out.println("\tInsert "+target+" at a["+(-i-1)+"]");
    }
    static void print(int[]a)
    {
        System.out.print("{"+a[0]);
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(","+a[i]);
        }
        System.out.println("}");
    }
}

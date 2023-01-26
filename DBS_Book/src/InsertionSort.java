public class InsertionSort
{
    public static void InsertSort(int[]array)
    {
        for (int i = 1; i < array.length ; i++)
        {
            int ai = array[i];
            int j = i;
            for ( j = i; j > 0 && array[j-1] > ai ; j--)
            {
                array[j] = array[j - 1];
            }
            array[j] = ai;
        }
    }

    public static void main(String[] args)
    {
        int[]values = {5, 1, 3, 6, 4, -2};
        System.out.println("Original order : ");
        for (int element : values)
        {
            System.out.print(element+" ");
        }
        InsertSort(values);
        System.out.println("\nSelectionsort order : ");
        for (int element : values)
        {
            System.out.print(element+" ");
        }
    }
}

public class IntselectionSort
{
    public static void selectionSort(int[]array)
    {
        int i;
        int j;
        int minIndex;
        int minValue;
        for ( i = 0; i < (array.length-1); i++)
        {
            minIndex = i;
            minValue = array[i];
            for (j = i+1; j < array.length ; j++)
            {
                if (array[j]<minValue)
                {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = minValue;
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
        selectionSort(values);
        System.out.println("\nSelectionsort order : ");
        for (int element : values)
        {
            System.out.print(element+" ");
        }
    }
}

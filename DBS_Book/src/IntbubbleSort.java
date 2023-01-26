public class IntbubbleSort
{
    public static void bubbleSort(int[]array)
    {
        int maxElement;
        int index;
        int temp;
        for ( maxElement = array.length-1; maxElement >= 0 ; maxElement--)
        {
            for ( index = 0; index <= maxElement-1; index++)
            {
                if (array[index]>array[index+1])
                {
                    temp = array[index];
                    array[index] = array[index+1];
                    array[index+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[]vales = {5, 1, 3, 6, 4, 2};
        System.out.println("Original order : ");
        for (int element : vales)
        {
            System.out.print(element+" ");
        }
        bubbleSort(vales);
        System.out.println("\nSort order : ");
        for (int element : vales)
        {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}

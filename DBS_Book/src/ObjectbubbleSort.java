public class ObjectbubbleSort

{
    public static void bubbleSort(Comparable[] array)
    {
        int maxElement;
        int index;
        Comparable temp;
        for (maxElement = array.length-1; maxElement >= 0; maxElement--)
        {
            for (index = 0; index <= maxElement-1 ; index++)
            {
                if (array[index].compareTo(array[index+1])>0)
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
        String []values = {"David", "Abe", "Katherine", "Beth", "Jeff", "Daisy"};
        System.out.println("Original order : ");
        for (String element : values)
        {
            System.out.print(element+" ");
        }
        bubbleSort(values);
        System.out.println("\nSort order : ");
        for (String element : values)
        {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}

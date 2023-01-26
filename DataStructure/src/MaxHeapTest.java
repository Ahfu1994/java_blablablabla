import java.util.Comparator;

public class MaxHeapTest
{
    public static void main(String[] args)
    {
        MaxHeap<Integer> h = new MaxHeap(new IntegerComparator());
        for (int i = 0; i < 10; i++)
        {
            int x = (int)(Math.random()*100);
            System.out.print(x+"\t");
            h.add(x);
        }
        System.out.println();
        while(h.size() > 0)
        {
            h.Print();
            System.out.println(h.getMax()+"\t");
        }
    }
}

 class IntegerComparator implements Comparator<Integer>
{

    public int compare(Integer arg0, Integer arg1)
    {
        return arg0-arg1;
    }
}
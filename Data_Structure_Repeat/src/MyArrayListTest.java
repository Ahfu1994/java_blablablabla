public class MyArrayListTest
{
    public static void main(String[] args)
    {
        MyArrayList L = new MyArrayList();
        for (int i = 0; i <10 ; i++)
        {
            L.add((int)(Math.random()*100));
        }
        L.add(1);
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(5);
        L.search(100);
        System.out.println(L);
        System.out.println( L.search(5));

    }
}

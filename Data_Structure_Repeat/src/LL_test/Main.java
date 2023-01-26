package LL_test;

public class Main
{
    public static void main(String[] args)
    {
//        LL list = new LL();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertLast(5);
//        list.display();
//        System.out.println( list.deleteFirst());
//        list.display();
        DLL list = new DLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(99);
        list.insert(3,65);
        list.display();
        list.displayRev();


    }
}

public class RecursionIsCool
{
    public static void main(String[] args)
    {
        sayHi(3);
        sayHi2(3);
    }
    public static void sayHi(int n)
    {
        if(n==0)
        {
            System.out.println("Done!!!");
            return;
        }
        else
        {
            System.out.println("Hi");
        }
        n--;
        sayHi(n);
    }
    public static void sayHi2(int n)
    {
        if (n==0) //เงื่อนไข Base case การออกจาก Loop
        {
            System.out.println("Done!!!");
            return;
        }
        else //General case การเรียกตัวเองซ้ำ
        {
            System.out.println("Hi");
        }
        sayHi2(n-1);
    }
}

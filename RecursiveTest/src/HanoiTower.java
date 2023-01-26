public class HanoiTower
{
    public static void main(String[] args)
    {
        int n = 3;
        hanoi(n, "A" ,"B", "C");
    }
    public static void hanoi(int n, String a, String b, String c)
    {
        if (n == 0) return ;
        hanoi(n-1, a, c, b);
        System.out.println("ย้ายจานที่ "+n+" จาก "+ a +" ไป "+ c);
        hanoi(n-1, b, a, c);
    }
}

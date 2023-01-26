import java.util.Scanner;

public class haveA
{
    public static int haveA(String str)
    {
        int l = str.length();
        int count = 0;
            for (int i = 0; i < l; i++)
            {
                if (str.charAt(i) == 'a')
                {
                    count++;
                }
            }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println( haveA(a));

    }
}

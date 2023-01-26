import java.util.Scanner;

public class Palindrome_String
{
    public static String reverse(String str)
    {
        String rev = "";
        for (int i = str.length()-1; i >=0 ; i--)
        {

            rev = rev + str.charAt(i);
        }
        return rev;
    }
    public static boolean Palindrome(String str)
    {
        return reverse(str).equals(str);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(reverse(a));
        System.out.println(Palindrome(a));
    }
}

public class Palindorm_Check
{
    public static int reverse(int nums)
    {
       int rev = 0;
        for (int i = 0; i < nums; nums/=10)
        {
            int lastdigit = nums%10;
            rev = rev*10 + lastdigit;
        }
        return rev;
    }
    public static boolean Palindrome(int nums)
    {
        return reverse(nums)==nums;
    }

    public static void main(String[] args)
    {
        int a = 123321;
        System.out.println(reverse(a));
        System.out.println(Palindrome(a));
    }
}

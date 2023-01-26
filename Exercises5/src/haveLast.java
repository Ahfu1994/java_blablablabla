public class haveLast
{
    public static int Count(String str1, String str2)
    {
        int count = 0;
        for (int i = 0; i < str1.length(); i++)
        {
            if(i+str2.length()<=str1.length())
            {
                if (str1.substring(i, i + str2.length()).equals(str2))
                {
                    count = count + 1;
                }
            }
        }
        return count;
    }
    public static int indexPositon(String str1, String str2)
    {
        int index = 0;
        int i;
        for ( i = 0; i < str1.length(); i++)
        {
            if(i+str2.length()<=str1.length())
            {
                if (str1.substring(i, i + str2.length()).equals(str2))
                {
                    index = i;
                }
            }
        }
        return index;
    }

    public static void main(String[] args)
    {
        String A = "bacabab";
        String B ="abab";
        System.out.println(Count(A,B));
        System.out.println(indexPositon(A,B));
    }
}

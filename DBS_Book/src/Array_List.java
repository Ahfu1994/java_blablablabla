import java.util.ArrayList;

public class Array_List
{
    public static void main(String[] args)
    {
        ArrayList nameList = new ArrayList();
        nameList.add("Twat");
        nameList.add("Java");
        nameList.add("Micro");
        System.out.println("The ArrayList has "+nameList.size()+" object stored in it.");
        for (int i = 0; i <nameList.size() ; i++)
        {
            System.out.println(nameList.get(i));
        }
    }
}

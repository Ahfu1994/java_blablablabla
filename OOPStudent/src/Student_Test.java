import java.util.Scanner;

public class Student_Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        String []names = new String[10];
//        String []surnames = new String[10];
//        int []score = new int[10];
        Student []ss = new Student[3];

        for (int i = 0; i < ss.length ; i++)
        {
            System.out.println(
                    "Please input name , surname , score of student"+(i+1));
            ss[i] = new Student();
            ss[i].names = sc.nextLine();
            ss[i].surnames = sc.nextLine();
            ss[i].scores = sc.nextInt();sc.nextLine();
        }

        String max_name = "";
        String max_surname = "";
        Student max = new Student();
         max.scores = Integer.MIN_VALUE;
        for (int i = 0; i <ss.length ; i++)
        {
            if (ss[i].scores > max.scores)
            {
                max = ss[i];
//                max.scores = ss[i].scores;
//                max.names = ss[i].names;
//                max.surnames = ss[i].surnames;
            }
        }
        System.out.println(max.names+"\n"+max.surnames+"\n"+max.scores);
    }

}

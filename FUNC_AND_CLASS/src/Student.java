import java.util.Scanner;

public class Student
{
     public int id;
     public String name;
     public String surname;
     public String classroom;
     int score;

    public Student()
    {
    }

    public Student(int id, String name, String surname, String classroom, int score)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.classroom = classroom;
        this.score = score;
    }

    public String getFullname()
    {
        String fullname = name+"\t"+surname;
        return fullname;
    }

    public String getClassroom()
    {
        return classroom;
    }

    public int getScore()
    {
        return score;
    }
    public String getGrade()
    {
        if (score > 90) return "A";
        else if (score >= 81 && score <= 90) return "B";
        else if (score >= 71 && score <= 80) return "C";
        else if (score >= 61 && score <= 70) return "D";
        else return "F";
    }
    public static double scoreAgerage(Student s[])
    {
        double sum = 0;
        for (int i = 0; i < s.length; i++)
        {
            sum = sum + s[i].score;
        }
        double avg = sum/s.length;
        return avg;
    }
    public static double scoreclass(Student s[], String classroom)
    {
        double sum = 0;
        for (int i = 0; i < s.length; i++)
        {
            sum = sum + s[i].score;
        }
        double avg = sum/s.length;
        return avg;
    }
    public static void ranking(Student s[])
    {
        int i = 0;
        for (; i <s.length ; i++)
        {
            for (int j = 0; j <s.length-i-1; j++)
            {
                if (s[j].score<s[j+1].score)
                {
                    int temp = s[j].score;
                    s[j].score = s[j+1].score;
                    s[j+1].score = temp;
                }
            }
        }
        System.out.println(s[i].getFullname());
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student []A = new Student[5];
        for (int i = 0; i <A.length ; i++)
        {
            A[i] = new Student();
            A[i].id = sc.nextInt();sc.nextLine();
            A[i].name = sc.nextLine();
            A[i].surname = sc.nextLine();
            A[i].classroom = sc.nextLine();
            A[i].score = sc.nextInt();sc.nextLine();
        }
//        System.out.println(A[0].getFullname());
//        System.out.println(A[0].getClassroom());
//        System.out.println(A[0].getScore());
//        System.out.println(scoreavgerage(A));
        System.out.println();
    }
}

import java.util.Objects;
import java.util.Scanner;

public class Student
{
    private int id;
    private String name;
    private String surname;
    private String classroom;
    private int score;

    public Student()
    {

    }
    public Student(int id,String name,String surname,String classroom,int score)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.classroom = classroom;
        this.score = score;
    }

    public String getFullname()
    {
        String fullname = name+' '+surname;
        return fullname;
    }
    public String getClassroom()
    {
        return classroom;
    }
    public int getScore()
    {
        return this.score;
    }
    public String getGrade()
    {
        if (score > 90) return "A";
        else if (score >= 81 && score <= 90) return "B";
        else if (score >= 71 && score <= 80) return "C";
        else if (score >= 61 && score <= 70) return "D";
        else return "F";
    }
    public static double scoreAverage(Student[]s)
    {
        double sum = 0;

        for (int i = 0; i < s.length ; i++)
        {
            sum = s[i].score + sum;
        }
        double avg = sum/s.length;
        return avg;
    }

    public static void main(String[]agrs)
    {
        Scanner sc = new Scanner(System.in);
        Student [] a = new Student[10];
//        a.id = 3;
//        a.name = "Marry";
//        a.surname = "Poppins";
//        a.classroom = "A01";
//        a.score = 93;
//
        for (int i = 0; i < a.length; i++)
        {
            a[i].id = sc.nextInt();
            a[i].name = sc.nextLine();
            a[i].surname = sc.nextLine();
            a[i].classroom = sc.nextLine();
            a[i].score = sc.nextInt();
            sc.nextLine();
        }

//        System.out.println(a.getFullname());
//        System.out.println(a.getClassroom());
//        System.out.println(a.getScore());
//        System.out.println(a.getGrade());
        System.out.println( Student.scoreAverage(a));

    }

}

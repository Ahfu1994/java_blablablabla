import java.util.Scanner;

public class StudentTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student[] B ;
        B = new Student[10];
        for (int i = 0; i < B.length ; i++)
        {
            B[i].id = sc.nextInt();sc.nextLine();
            B[i].name = sc.nextLine();
            B[i].surname = sc.nextLine();
            B[i].classroom = sc.nextLine();
            B[i].score = sc.nextInt();sc.nextLine();
        }
    }
}

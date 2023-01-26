import java.util.Scanner;

public class Student_main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student []s = new Student[3];
        for (int i = 0; i<s.length;i++) {
            System.out.println("Input name, surname, score of students");
            s[i].name = sc.nextLine();
            s[i].surname = sc.nextLine();
            s[i].score = sc.nextInt();
            sc.nextLine();
        }

        Student max = s[0];
        for (int i = 0; i < s.length; i++) {
            if (max.score< s[i].score){
                max = s[i];
            }
        }
        System.out.println(max.name+"\n"+max.surname+"\n"+max.score);
    }
}

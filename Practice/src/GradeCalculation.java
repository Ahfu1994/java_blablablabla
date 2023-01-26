import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class GradeCalculation
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc= new Scanner(new File("d:/score.txt"));
        PrintStream ps = new PrintStream(
                new File("d:/grade.txt"));
        while (sc.hasNext())
        {
            String person = sc.nextLine();
            person = person.trim();
            int i = person.indexOf(" ",0);
            if (i>=0)
            {
                String id = person.substring(0,i);
                String s = person.substring(i,person.length());
                double score = Double.parseDouble( s);

                String grade;
                if (score>80) grade = "A";
                else if (score>=70) grade ="B";
                else if (score>=60) grade ="C";
                else if (score>=50) grade ="D";
                else  grade ="F";
                ps.println(id+"\t"+grade);
            }
        }
        ps.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudyReader2
{
    public static void main(String[] args) throws IOException
    {
        String st = "0";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write something and exit by exit");
        do
        {
            st = br.readLine();
            System.out.println(st);
        }while(!st.equals("exit"));

    }
}

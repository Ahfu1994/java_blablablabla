import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader_Test
{
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\Admin CT\\Desktop\\captmidn.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception e) {
            return;
        }
    }
}

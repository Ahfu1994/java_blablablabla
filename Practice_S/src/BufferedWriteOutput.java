import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriteOutput
{
    public static void main(String[] args) {
        {
            try {
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter("C:\\Users\\Admin CT\\Desktop\\EPT\\Test\\Output.txt"));
                bw.write("karen\n");
                bw.write("chad\n");
                bw.write("becky\n");
                bw.write("jerry\n");
                bw.close();

            } catch (Exception ex) {
                return;
            }
        }
    }
}


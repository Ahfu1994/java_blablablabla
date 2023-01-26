import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader300
{
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Admin CT\\Desktop\\captmidn.txt");
        Scanner sc = new Scanner(file);
        String fileContent = "It file made by me";
        while ( sc.hasNextLine())
        {
            fileContent = fileContent.concat(sc.nextLine()+ "\n");
        }
        FileWriter fw = new FileWriter(
                "C:\\Users\\Admin CT\\Desktop\\Newfile.txt");
        fw.write(fileContent);
        fw.close();
    }
}

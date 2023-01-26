import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStream_Test
{
    public static void main(String[] args) {
        FileInputStream in = null;
        try
        {
            in = new FileInputStream("c:\\newJava1\\test.txt");
            int i;
            System.out.println("*** Read file ***");
            while((i = in.read()) != -1){
                System.out.printf("%d/n ",i);
            }
        }catch (IOException e){
            System.out.println(e);
        }
        finally {
            try
            {
                if (in != null)
                {
                    in.close();
                }
                System.out.println("*** Finish ***");
            }
            catch (IOException e){
                System.out.println(e);
            }
        }
    }
}

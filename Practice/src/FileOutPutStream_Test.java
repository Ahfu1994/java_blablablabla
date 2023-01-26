import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutPutStream_Test
{
    public static void main(String[] args) {
        String fname = "c:\\newJava1\\test1.txt";
        FileOutputStream out = null;
        try
        {
            out = new FileOutputStream(fname);
            int age;
            System.out.println("*** Personal Age ***");
            do{
                System.out.println("Enter age: ");
                age = new Scanner(System.in).nextInt();
                if (age != 0)
                {
                    out.write(age);
                }
            }while(age != 0);
        }catch (IOException e){
            System.out.println(e);
        }
        finally {
            try
            {
             if (out != null)
             {
                 out.close();
             }
                System.out.println("*** Finish ***");
            }
            catch (IOException e){
                System.out.println(e);
            }
        }
    }
}

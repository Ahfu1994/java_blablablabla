import java.io.File;
import java.io.IOException;

public class methodFile
{
    public static void main(String[] args) throws IOException{
        {
            File f1 = new File("c:/newJava1");
            File f2 = new File("c:/newJava2/example");
            File f3 = new File("c://newJava1/test1.txt");
            File f4 = new File("c://newJava1/test2.txt");
            File fnew1 = new File("c://newJava2/test2.txt");
            File fnew2 = new File("c://newJava2/text3.txt");

            if (f1.mkdir() == true) {
                System.out.println("Make directory " + f1.getPath() + " success.");
            } else {
                System.out.println("Make directory fail!");
            }

            if (f2.mkdirs() == true) {
                System.out.println("Make directory " + f2.getPath() + " success.");
            } else if (f2.mkdir() != true){
                System.out.println("Make directory fail!");
            }

            System.out.println("File: " + f3.getName() + " is " + f3.length() + "bytes");
            System.out.println("Path: " + f3.getPath());
            System.out.println("Parent: " + f3.getParent());

            if (f3.canWrite()) {
                System.out.println(f3.getName() + " is writable.");
            }
            if (f3.canRead()) {
                System.out.println(f3.getName() + " is readable.");
            }
            if (f3.isFile()) {
                System.out.println(f3.getName() + " is a file.");
            } else if (f3.isDirectory()) {
                System.out.println(f3.getName() + " is a directory");
            } else {
                System.out.println("Unknown!!!");
            }

            if (!f4.exists()) {
                f4.createNewFile();
                System.out.println("File is created");
                System.out.println("File: " + f4.getName() + " is " + f4.length() + "bytes.");
            }
            else
            {
                System.out.println("File already exists.");
            }
            f4.renameTo((fnew1));
            fnew1.renameTo(fnew2);
            if (fnew2.exists())
            {
                System.out.println("File: "+fnew2.getName()+" is "+fnew2.length()+"bytes.");
            }
            fnew2.delete();
            if (fnew2.exists())
            {
                System.out.println("File: "+fnew2.getName()+" is "+fnew2.length()+" bytes.");
            }
            else
            {
                System.out.println(fnew2.getName()+" is not exists.");
            }
        }
    }
}

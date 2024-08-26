package IO_FileHandling;

/**
 * LAunchFile1
 */
import java.io.*;

public class LAunchFile1 {

    public static void main(String[] args) throws IOException {
        File file1 = new File("try.txt");
        System.out.println(file1.exists());
        file1.createNewFile();
        System.out.println(file1.exists());


        File dir = new File("MyDir");
        System.out.println(dir.exists());
        dir.mkdir();
        System.out.println(dir.exists());
    }
}
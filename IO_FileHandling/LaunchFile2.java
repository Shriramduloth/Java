package IO_FileHandling;
import java.io.*;

public class LaunchFile2 {
    public static void main(String[] args) throws IOException {
        // File file1 = new  File("try.txt");
        // System.out.println(file1.isFile());

        File dir = new File("IO_FileHandling");
        // System.out.println(dir.isDirectory());

        File file1 = new File(dir ,"pw.txt");
        // System.out.println(file1.isFile());
        file1.createNewFile();
        
        int count =0;
        String s[] = dir.list();
        for (String name : s) {
            count++;
            System.out.println(name);
        }
        System.out.println(count);
    }
}

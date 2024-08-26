package IO_FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFW {
    public static void main(String[] args) throws IOException {
        File f = new File("MyDir");
        File f2 = new File(f, "pw.txt");
        
        // System.out.println(f2.exists());
        FileWriter fw = new FileWriter(f2,true);

        fw.write("Java");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[]={'j','a','v','a'};
        fw.write(ch);
        fw.write("\n");

        //fw.close();
        fw.flush();
        System.out.println("Open pw.txt to see result");

    }
}

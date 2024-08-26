package IO_FileHandling;

import java.io.*;

public class LaunchPrintWriter {
    public static void main(String[] args) throws IOException{
        File dir = new File("MyDir");
        File file = new File(dir,"pw.txt");

        FileWriter fw = new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);
        pw.write("\n");

        pw.println("Java");
        pw.print(100);
        pw.println('a');
        pw.println(50.5);
        pw.println(true);
        pw.close();

        


        
    }
}

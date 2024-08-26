package IO_FileHandling;

import java.io.*;

public class LaunchBufferWriter {
    public static void main(String[] args) throws IOException{
        File dir = new File("MyDir");
        File file = new File(dir,"pw.txt");

        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("PW");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        bw.write(97);
        bw.newLine();
        char ch[]={'j','a','v','a'};
        bw.write(ch);

        bw.flush();
        bw.close();


        
    }
}

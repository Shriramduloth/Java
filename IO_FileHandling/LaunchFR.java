package IO_FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchFR {
    public static void main(String[] args) throws IOException {
        File dir = new File("MyDir");
        File file = new File(dir, "pw.txt");

        FileReader fr = new FileReader(file);
        // int i =fr.read();
        // //System.out.println((char)i);
        // while(i!=-1){
        //     System.out.print((char)i);
        //     i=fr.read();
        // }\
        char ch[]=new char[(int)file.length()];
        fr.read(ch);
        for(char i:ch){
            System.out.print(i);

        }
    }
}

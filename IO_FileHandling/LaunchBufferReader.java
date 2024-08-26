package IO_FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchBufferReader {
    public static void main(String[] args) {
        try {
            File dir = new File("MyDir");
            File file = new File(dir, "pw.txt");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line=br.readLine();

            while (line!=null) {
                System.out.println(line);
                line = br.readLine();
                
            }

        } catch (IOException ie) {
            System.out.println("Input output error");
        }
        catch(Exception e){
            System.out.println("Some error");
        }
        
    }
    
}

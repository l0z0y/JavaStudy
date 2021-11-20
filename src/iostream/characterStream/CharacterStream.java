package iostream.characterStream;

import java.io.*;
import java.util.Arrays;

/**
 * @author li'zi'yao
 */
public class CharacterStream {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\code\\data.log");
        FileReader s = new FileReader(file);
        int z = 0;
        try {
            while ((z = s.read()) != -1) {
                System.out.print((char) z);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

        FileReader s1 = new FileReader(file);
        char [] b = new char[3];
        while (s1.read(b)!=-1) {

            String st = new  String(b);
            System.out.print(st);
        }
    }
}

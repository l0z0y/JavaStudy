package iostream.characterStream;

import java.io.*;

/**
 * @author li'zi'yao
 */
public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileWriter s = new FileWriter(new File("C:\\code\\data.log"),true);
        s.write('z');
        s.write("\r\n");
        String st = "我是lzy" ;
        s.write(st);
        s.write("\r\n");
        char[]ch ={95,96,97,94};
        s.write(ch);
        s.write("\r\n");
        s.write(ch,0,3);
        s.flush();

        FileInputStream in = new FileInputStream(new File("C:\\code\\data.log"));
        byte[] buffer = in.readAllBytes();
        System.out.println(new String(buffer));

    }
}

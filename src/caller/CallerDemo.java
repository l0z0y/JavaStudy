package caller;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author li'zi'yao
 */
public class CallerDemo {
    public static void main(String[] args) throws IOException {
        Reader r = new FileReader("C:\\code\\www.txt");
        ArrayList <String>  ar = new ArrayList<>();
        BufferedReader br = new BufferedReader(r);
        String s;
        while ((s=br.readLine())!=null) {
            ar.add(s);
        }
        Random ran = new Random();
        int z = ran.nextInt(ar.size());
        System.out.println(ar.get(z));


    }
}

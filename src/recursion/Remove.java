package recursion;

import java.io.File;

/**
 * @author li'zi'yao
 */
public class Remove {
    public static void main(String[] args) {

        File file = new File("C:\\code\\log1");
        remove(file);
    }
    public static void remove(File s) {
        if (s.isDirectory()) {
            File[] z = s.listFiles();
            for (File file : z) {
                if (file.isFile()) {
                    file.delete();
                } else {
                    remove(file);
                }
            }
        } else if (s.isFile()) {
            System.out.println("输如有误");
        }
        try {
            s.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package file.method;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author li'zi'yao
 */
public class FileView {
    public static void main(String[] args) {
        File file = new File("C:\\code");
        File[] s = file.listFiles();

        SimpleDateFormat simpledataformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Arrays.sort(s ,(o1, o2) -> o2.lastModified() - o1.lastModified() >= 0 ? 1 : -1);
        for (File value : s) {
            System.out.println(value + "\t\t\t\t" + simpledataformat.format(value.lastModified()));
        }

        Map<String, Integer> map = new HashMap<>();
        for (File file1 : s) {
            if (file1.isFile()) {
                String name = file1.getName();
                String[] split = name.split("\\w+\\.");
                System.out.println(Arrays.toString(split));
                if (map.containsKey(split[1])) {
                    Integer count = map.get(split[1]);
                    count = count + 1;
                    map.put(split[1], count);
                } else {
                    map.put(split[1], 1);
                }
            }
        }
        System.out.println(map);


    }
}

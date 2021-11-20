package propertiesqq;

import java.io.FileWriter;
import java.util.Properties;

/**
 * @author li'zi'yao
 */
public class PropertiesDemo {
        public static void main(String[] args) throws Exception {
            // 需求：使用Properties把键值对信息存入到属性文件中去。
            Properties properties = new Properties();
            properties.setProperty("admin", "123456");
            properties.setProperty("dlei", "003197");
            properties.setProperty("heima", "itcast");
            System.out.println(properties);

            /**
             参数一：保存管道 字符输出流管道
             参数二：保存心得
             */
            properties.store(new FileWriter("C:\\code\\www.txt")
                    , "this is users!! i am very happy! give me 100!");

        }
}

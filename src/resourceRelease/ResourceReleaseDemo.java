package resourceRelease;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author li'zi'yao
 */
public class ResourceReleaseDemo {
    public static void main(String[] args) {
        try {
            // 1、创建一个字节输入流管道与原视频接通
            FileInputStream is = new FileInputStream("C:\\code\\data.log");
            // 2、创建一个字节输出流管道与目标文件接通
            FileOutputStream os = new FileOutputStream("C:\\code\\zzz.log");
            // 3、定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数。
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成了！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 无论代码是正常结束，还是出现异常都要最后执行这里
            System.out.println("========finally=========");
        }
        System.out.println(test(10, 0));
    }

    public static int test(int a, int b) {
        try {
            int c = a / b;
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return -111111;
        } finally {
            // 哪怕上面有return语句执行，也必须先执行完这里才可以！
            System.out.println("--finally--");

        }

    }

}


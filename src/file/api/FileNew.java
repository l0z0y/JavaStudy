package file.api;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author li'zi'yao
 */
public class FileNew {
    public static void main(String[] args) {
        File file = new File("C:\\code\\data.log");

        // file.isDirectory() 测试此抽象路径名表示的File是否为文件夹 返回boolean
        System.out.println(file.isDirectory());
        //file.isFile()  测试此抽象路径名表示的File是否为文件  返回boolean
        System.out.println(file.isFile());
        //file.exists()  测试此抽象路径名表示的File是否存在 返回boolean
        System.out.println(file.exists());
        // file.getAbsoluteFile() 返回此抽象路径名的绝对路径名字符串
        System.out.println(file.getAbsoluteFile());
        //  file.getPath() 将此抽象路径名转换为路径名字符串
        System.out.println(file.getPath());
        //file.getName() 返回由此抽象路径名表示的文件或文件夹的名称
        System.out.println(file.getName());
        //file.lastModified() 返回文件最后修改的时间毫秒值
        System.out.println(file.lastModified());
        Date data = new Date(file.lastModified());
        SimpleDateFormat simpledataformat = new
        SimpleDateFormat("YY年MM月dd日 HH:mm:ss");
        System.out.println("最后一次修改的时间是：" + simpledataformat.format(data));
        System.out.println();


        // file1.mkdir() 创建单级文件夹
        File file1 = new File("C:\\code\\log");
        System.out.println("单级文件夹创建：" + file1.mkdir());

        //file2.createNewFile() 创建一个新的空的文件
        File file2 = new File("C:\\code\\log.txt");
        try {
            System.out.println(file2.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 创建多级文件夹
        File file3 = new File("C:\\code\\log1\\zz");
        System.out.println("多级文件夹创建：" + file3.mkdirs());

        //删除由此抽象路径名表示的文件或空文件夹   默认只能删除文件和空文件夹
        System.out.println("删除"+file1.delete());
        System.out.println("删除"+file2.delete());
        System.out.println("删除"+file3.delete());

    }
}

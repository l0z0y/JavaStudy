package iostream.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author li'zi'yao
 */
public class ByteStreamMethod {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\code\\data.log");
        System.out.println(file.exists());
        FileInputStream fileInputStream = new FileInputStream(file);
        int b = 0;
        while (b != -1) {

            b = fileInputStream.read();

            System.out.print((char) b);
        }
        System.out.println();
        FileInputStream fileInputStream2 = new FileInputStream(file);
        byte[] buffer = new byte[3];
        int len = 0;
        while (len != -1) {
            len = fileInputStream2.read(buffer);
            //String s = new String(buffer);  通过使用平台的默认字符集解码指定的字节数组来构造新的  String
            String s = new String(buffer);
            System.out.print(s);

        }
        System.out.println();
        FileInputStream fileInputStream3 = new FileInputStream(file);
        //fileInputStream3.readAllBytes()  直接将当前字节输入流对应的文件对象的字节数据装到一个字节数组返回
        byte[] bytes = fileInputStream3.readAllBytes();
        System.out.println(new String(bytes));

        FileInputStream fileInputStream4 = new FileInputStream(file);
        //创建一个和文件直接一样的数组
        byte[] bytes2 =new byte[(int) file.length()];
        fileInputStream4.read(bytes2);
        String z = new String(bytes2);
        System.out.println(z);

        //创建字节输出流管道与源文件对象接通，可追加数据
        FileOutputStream f1 = new FileOutputStream(file,true);
        String w = "我是lzy";

        // 将字符串w编码为字节数组
        byte [] vv = w.getBytes();

        //  f1.write(vv) 写一个字节数组出去
        f1.write(vv);
        //f1.write('a') 写一个字节进去
        f1.write('a');
        // 换行
        f1.write("\t\n".getBytes());
        //刷新数据流
        f1.flush();
        //写数组的一部分
        byte[] buffer3 = {'a',97, 98, 99};
        f1.write(buffer3, 0 , 3);
        f1.write("\r\n".getBytes());


    }
}

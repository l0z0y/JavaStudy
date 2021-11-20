package bufferStream.beytbuffer;

import java.io.*;

/**
 * @author li'zi'yao
 */
public class Demo {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("C:\\code\\data.log");
            // a.把原始的字节输入流包装成高级的缓冲字节输入流
            InputStream ins = new BufferedInputStream(in);
            OutputStream os = new FileOutputStream("C:\\code\\data.log");
            // b.把字节输出流管道包装成高级的缓冲字节输出流管道
            OutputStream bos = new BufferedOutputStream(os);
            long timeMillis = System.currentTimeMillis();
            File s = new File("C:\\code\\444");
            File z = new File("C:\\code\\www");
            copy(s,z);
            long timeMillis2 = System.currentTimeMillis();
            System.out.println(timeMillis2-timeMillis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void copy(File s, File z) {
        // 1、判断源目录是否存在
        if (s != null && s.exists() && s.isDirectory()) {
            // 2、目标目录需要创建一下  D:\new\resources
            if (z.exists() && z.isDirectory()) {
                // 3、提取原目录下的全部一级文件对象
                File[] files = s.listFiles();
                // 4、判断是否存在一级文件对象
                if (files != null && files.length > 0) {
                    // 5、遍历一级文件对象
                    for (File file : files) {
                        // 6、判断是文件还是文件夹，是文件直接复制过去
                        if (file.isFile()) {
                            copyFile(file, new File(z, file.getName()));
                        } else {
                            // 7、当前遍历的是文件夹，递归复制
                            copy(file, z);
                        }
                    }

                }
            } else {
                z.mkdirs();
                copy(s, z);
            }

        }
    }

    private static void copyFile(File s, File d) {
        try (
                InputStream in = new FileInputStream(s);
                // a.把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream ins = new BufferedInputStream(in);
                OutputStream os = new FileOutputStream(d);
                // b.把字节输出流管道包装成高级的缓冲字节输出流管道
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            // 3、定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数。
            while ((len = ins.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

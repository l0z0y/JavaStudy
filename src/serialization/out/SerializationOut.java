package serialization.out;

import java.io.*;

/**
 * @author li'zi'yao
 */
public class SerializationOut {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s = new Student("lzy",22,4);
        ObjectOutputStream s1 = new ObjectOutputStream(new FileOutputStream("C:\\code\\www.txt"));
        s1.writeObject(s);
        s1.close();

        // 1、创建对象字节输入流管道包装低级的字节输入流管道
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\code\\www.txt"));

        // 2、调用对象字节输入流的反序列化方法
        Student s2 = (Student) is.readObject();

        System.out.println(s);
    }
    }



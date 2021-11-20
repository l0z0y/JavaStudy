package iostream.bytestream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author li'zi'yao
 */
public class ByteDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "我是zwww";

         // 1、编码：把文字转换成字节（使用指定的编码）
        byte[] bytes = s.getBytes("UTF-8");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        // 2、解码：把字节转换成对应的中文形式（编码前 和 编码后的字符集必须一致，否则乱码 ）

        String rs = new String(bytes, "UTF-8");
        System.out.println(rs);

    }
}

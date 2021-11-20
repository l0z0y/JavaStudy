package printstream.printstream;

import java.io.PrintWriter;

/**
 * @author li'zi'yao
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {
        // 打印功能上与PrintStream的使用没有区别
        PrintWriter ps = new PrintWriter("C:\\code\\www.txt");
        ps.println(97);
        ps.println('a');
        ps.println(23.3);
        ps.println(true);
        ps.println("我是打印流输出的，我是啥就打印啥");

        ps.close();
    }
}

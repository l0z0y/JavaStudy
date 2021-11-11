package object.tostring;

import object.tostring.Student;

/**
 * @author li'zi'yao
 */
public class TostringtDemo {
    public static void main(String[] args) {

        // 查看方法的源码 选中方法 按下 Ctrl+B
        Student s = new Student();
        s.setAge(15);
        s.setName("lzy");
        System.out.println(s);
        System.out.println(s.toString());


        /*

          public void println(Object x) {
                  String s = String.valueOf(x);
                  if (getClass() == PrintStream.class) {
                      // need to apply String.valueOf again since first invocation
                      // might return null
                      writeln(String.valueOf(s));
                  } else {
                      synchronized (this) {
                          print(s);
                          newLine();
                      }
                  }
              }
         */

    }
}

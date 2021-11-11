package system;

/**
 * @author li'zi'yao
 */
public class SystemDemo {
    public static void main(String[] args) {

        //返回当前时间 以毫秒为单位  System.currentTimeMillis()
        System.out.println(System.currentTimeMillis());

        //计算程序耗时
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start+"毫秒");

        //终止当前运行的Java虚拟机， System.exit( int status)
        System.out.println("开始");
        System.exit(0);
        System.out.println("结束");


    }
}

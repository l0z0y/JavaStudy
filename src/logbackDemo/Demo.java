package logbackDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author li'zi'yao
 */
public class Demo {
    public static Logger logger = LoggerFactory.getLogger("Demo.class");

    public static void main(String[] args) {
        try {
            logger.debug("开始了");
            logger.info("ccc");
            int a = 10;
            int b = 0;
            logger.trace("a" + a);
            logger.trace("b" + b);
            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("异常"+e);

        }


    }
}

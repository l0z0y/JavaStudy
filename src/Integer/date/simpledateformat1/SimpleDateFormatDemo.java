package Integer.date.simpledateformat1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author li'zi'yao
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {

        Date d =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s =sdf.format(d);
        System.out.println(s);

        SimpleDateFormat zxc = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
        String z = zxc.format(d);

        System.out.println(z);
        System.out.println();

        String ss = "20480809111111" ;
        SimpleDateFormat cc = new SimpleDateFormat("yyyyMMddHHmmss");
        Date w = cc.parse(ss);
        System.out.println(w);


    }
}

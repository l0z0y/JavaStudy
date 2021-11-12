package date.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author li'zi'yao
 */
public class DateUtils {
    public DateUtils() {
    }

    public String dateTostring (Date a , String format) {
        SimpleDateFormat ss = new SimpleDateFormat(format);
        return ss.format(a);
    }
    public Date stringToDate (String a,String format) throws ParseException {
        SimpleDateFormat ss = new SimpleDateFormat(format);
        return ss.parse(a);

    }


}

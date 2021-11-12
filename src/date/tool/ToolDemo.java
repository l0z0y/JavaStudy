package date.tool;

import java.text.ParseException;
import java.util.Date;

public class ToolDemo {
    public static void main(String[] args) throws ParseException {

        DateUtils s = new DateUtils();
        Date a = new Date();
        String string = s.dateTostring(a, "yyyy MM dd HH:mm");
        System.out.println(string);

        System.out.println();

        String z = "2022 11 12 11:11";
        Date date = s.stringToDate(z, "yyyy MM dd HH:mm");
        System.out.println(date);

    }
}

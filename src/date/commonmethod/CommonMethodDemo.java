package date.commonmethod;

import java.util.Date;

public class CommonMethodDemo {
    public static void main(String[] args) {
        Date c = new Date();
        System.out.println(c.getTime());

        System.out.println(c);

//        long date =1000*60*60;
        long date = c.getTime();
        c.setTime(date);
        System.out.println(c);
    }
}

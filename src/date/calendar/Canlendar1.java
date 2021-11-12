package date.calendar;

import java.util.Calendar;

/**
 * @author li'zi'yao
 */
public class Canlendar1 {
    public static void main(String[] args) {


        //多态的形式 获取对象
        Calendar ca = Calendar.getInstance();
        System.out.println(ca);

        // get(int field)
        int i = ca.get(Calendar.YEAR);
        // MONTH 从0 开始 要在后面加1
        int i1 = ca.get(Calendar.MONTH) + 1;
        int i2 = ca.get(Calendar.DATE);
        int i3 = ca.get(Calendar.HOUR);
        int i4 = ca.get(Calendar.MINUTE);
        System.out.println(i + " " + i1 + " " + i2 + " " + i3 + " " + i4);

        // add(int filed , int amount)  将指定的时间量添加或减去给定的日历字段
        ca.add(Calendar.YEAR,10);
        ca.add(Calendar.MONTH,-2);
        int i5 = ca.get(Calendar.YEAR);
        int i6 = ca.get(Calendar.MONTH)+1;
        System.out.println(i5+" "+i6);


        //set(int year, int month ,int date) 设置当前日历的年月日
        //月份下标从0开始赋值月份要-1  set(2022,11,12)是设置日历为2022.12.12
        ca.set(2022,11,12);
        int i7 = ca.get(Calendar.YEAR);
        int i9 = ca.get(Calendar.MONTH) + 1;
        int i8 = ca.get(Calendar.DATE);
        System.out.println(i7+" "+i8+" "+i9);

        ca.add(Calendar.YEAR,5);
        ca.add(Calendar.MONTH,-4);
        ca.add(Calendar.DATE,5);
        int ii1 = ca.get(Calendar.YEAR);
        int ii2 = ca.get(Calendar.MONTH) + 1;
        int ii3 = ca.get(Calendar.DATE);
        System.out.println(ii1 + " "+ii2 + " "+ii3);

    }
}

package date.februaryday;

import java.util.Calendar;
import java.util.Scanner;

public class FebruaryDayDemo {
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要设置的年份");
        int year = sc.nextInt();

        //月份下标从0开始赋值月份要-1
        ca.set(year, 2, 1);
        ca.add(Calendar.DATE, -1);
        int i = ca.get(Calendar.DATE);

        System.out.println(year + " 2月" + "有" + i + "天");
    }
}

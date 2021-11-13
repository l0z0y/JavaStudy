package regularexpression.first;

/**
 * @author li'zi'yao
 */
public class FirstExperienceDemo {
    public static void main(String[] args) {
        System.out.println(checkqq("54444442221"));
        System.out.println(checkqq("456465456564"));
        System.out.println(checkqq("12121qqwe"));
        System.out.println();

        System.out.println(checkqq1("54444442221"));
        System.out.println(checkqq1("456465456564"));
        System.out.println(checkqq1("12121qqwe"));
        System.out.println();

        System.out.println("454363zzz".matches("\\w{6,10}"));
        System.out.println("qweqweqwe".matches("\\W{6,10}"));
    }

    public static boolean checkqq(String s) {
        if (s == null || s.length() < 6 || s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }

        }
        return true;
    }

    public static boolean checkqq1(String s) {
        return s != null && s.matches("\\d{6,20}");
    }
}

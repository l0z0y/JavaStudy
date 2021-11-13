package regularexpression.crawlingInformation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlingInformationDemo {
    public static void main(String[] args) {
        String information = "来黑马程序学习Java,电话020-43422424，或者联系邮箱" +
                "itcast@itcast.cn,电话18762832633，0203232323" +
                "邮箱bozai@itcast.cn，400-100-3233 ，4001003232";

        //定义规则 字符串形式
        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,10}(\\.[a-zA-Z0-9]{2,10}){1,10})" +
                "|(1[3-9]\\d{9})|(0\\d{2,6}-)?\\d{5,20}|"+"(400-?\\d{3,9}-?\\d{3,9})";


        // 将规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        //得到一个容器匹配对象
        Matcher matcher=pattern.matcher(information);

        while(matcher.find()){
            String information1 = matcher.group();
            System.out.println(information1);

        }






    }
}

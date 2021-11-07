package arraylist.traverse;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {

        //创建集合对象
        ArrayList<String> list = new ArrayList<String>();
        list.add("qwe");
        list.add("asd");
        list.add("zxc");
        list.add("qwer");

        //遍历集合通用格式，通过size（）获取集合长度
        for (int i = 0; i < list.size();i++){
            String s =list.get(i);
            System.out.println(s);
        }
    }
}

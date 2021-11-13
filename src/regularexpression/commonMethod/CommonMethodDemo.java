package regularexpression.commonMethod;

public class CommonMethodDemo {
    public static void main(String[] args) {
        String name = "燕国asdasdasdfasd小小小asdasdasd乘车";

        // \\w+ 是一次或多次 匹配
        String[] arr = name.split("\\w+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        //name.replaceAll 是匹配字符并替换
        String arr1 = name.replaceAll("\\w+"," ");
        System.out.println(arr1);
    }
}

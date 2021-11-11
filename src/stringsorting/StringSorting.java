package stringsorting;

import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {
        String s = "91 27 46 38 50 ";


        String[] s1 = s.split(" ");

        int[] arr = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            arr[i] = Integer.parseInt(s1[i]);
            System.out.print(arr[i]);
            System.out.println();
        }
        Arrays.sort(arr);

        //用StringBuilder拼接元素成字符串

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            if (i == s1.length - 1) {
                // append 添加元素到字符串
                sb.append(s1[i]);
            } else {
                sb.append(s1[i]).append(" ");
            }
        }
        String ss = sb.toString();

        System.out.println(ss);

    }
}

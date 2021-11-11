package Arrary.sort;

import java.util.Arrays;

/**
 * @author li'zi'yao
 */
public class Sort {

    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 7, 9, 6, 2, 1, 1, 2};


        /*
        // 快速排序法 使用 Arrays 类中的 sort 方法
        // Arrays.sort( int [] )
        Arrays . sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
         */


        //使用Array.sort可进行选择想要排序的部分数字
        //如将下角标编号为1~7的数字进行排序，其他数字顺序不变
        //Arrays.sort(int [] ,1 ,7)
        Arrays.sort(arr,1,7);

        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }


    }

}

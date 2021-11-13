package Arrary.bubblesort;


import java.util.Arrays;

/**
 * @author li'zi'yao
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 7, 9, 6, 2, 1, 1, 2};

        // 返回指定数组的内容
        System.out.println(Arrays.toString(arr));


        /*
        // 快速排序法 使用 Arrays 类中的 sort 方法
        // Arrays.sort( int [] )
        Arrays . sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
         */

        /*
        //使用Array.sort可进行选择想要排序的部分数字
        //如将下角标编号为1~7的数字进行排序，其他数字顺序不变
        //Arrays.sort(int [] ,1 ,7)
        Arrays.sort(arr,1,7);

        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

         */

        // 冒泡排序法 从下到上，两两进行比较，越小的越往上，从而形成由小到大的排序
        int count;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    count = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = count;

                }
            }

        }
        for (int i : arr ) {
            System.out.print(arr[i] + ",");
        }


        System.out.println();

        //二分查找 返回索引 int类型  位置= 索引+1
        int z = Arrays.binarySearch(arr,8);
        System.out.println(z+1);
    }

}

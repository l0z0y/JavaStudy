package math;

public class MathDemo {
    public static void main(String[] args) {

        //绝对值 Math.abs(int a )
        System.out.println(Math.abs(-55));
        System.out.println();

        //向上去整 Math.ceil(double a )
        System.out.println(Math.ceil(15.22));
        System.out.println(Math.ceil(15.66));
        System.out.println();

        //向下取整 Math.floor(double a )
        System.out.println(Math.floor(15.22));
        System.out.println(Math.floor(15.66));
        System.out.println();

        //四舍五入 Math.round(float a )
        System.out.println(Math.round(15.22));
        System.out.println(Math.round(15.66));
        System.out.println();

        //比较大小 取最大值 Math.max(int a ,int b )
        System.out.println(Math.max(15.22,15.66));
        System.out.println();

        //比较大小 取最小值Math.min(int a ,int b )
        System.out.println(Math.min(15.22,15.66));
        System.out.println();

        //a的b次幂 返回结果 Math.pow(double a,double b )
        System.out.println(Math.pow(15.22,2));
        System.out.println();

        //随机取得一个区间为[0.0 1.0)的 double 值  Math.random()
        System.out.println(Math.random());
        System.out.println();

        //取值*100  Math.random()*100
        System.out.println(Math.random()*100);
        System.out.println();

        //取值变为整数  (int)(Math.random()*100)
        System.out.println((int)(Math.random()*100));

    }
}

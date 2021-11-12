package Integer.packingandunboxing;

public class PackingAndUnboxing {
    public static void main(String[] args) {
        // 装箱：把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100);
        // 自动装箱
        Integer ii = 100;

        //拆箱：把包装类类型转换为对应的基本数据类型
        ii = ii.intValue() + 22 ;

        //自动拆箱
        ii  = ii +22 ;

        Integer iii = null;

    }
}

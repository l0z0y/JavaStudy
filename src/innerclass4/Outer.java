package innerclass4;

/**
 * @author li'zi'yao
 */
public class Outer {
    public void  method(){
        /**
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };*/
/**
    // new Inter ()相当于一个对象 .show() 调用方法
        new Inter(){

            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();
 */

     // 多次调用  返回类型为接口或抽象类名  可赋值给该类对象  有该类对象调用方法
        Inter i = new Inter(){

            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();

    }


}

package innerclass;

public class Outer {

    private int age = 10;

    public void method() {

//        show();  需要创建内部类对象才能调用
        Inner i = new Inner();
        i.show();
    }

    public class Inner {

        public void show() {
            System.out.println(age);
        }

    }


}

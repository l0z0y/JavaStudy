package innerclass2;

public class Outer {
    private int age = 10;

    //    public class Inner {
//        public void show()
//        {
//            System.out.println(age);
//        }
//
//    }
    private class Inner {
        public void show() {
            System.out.println(age);
        }

    }

    public void  method( ){
        Inner i = new Inner();
        i.show();
    }



}

package generic;

public class GenericDemo {
    public static void main(String[] args) {
        MyArrays<String> ac = new MyArrays<>();
        ac.add("zzz");
        ac.add("xxxx");
        System.out.println(ac);

        MyArrays<Integer> zz =new MyArrays<>();
        zz.add(15);
        zz.add(22);
        System.out.println(zz);

    }
}

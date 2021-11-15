package genericMethod;

public class GenericMethod {
    public static void main(String[] args) {
        String [] a = {"zzz","asd","qwe"};
        Integer [] z = {10,20,30};
        show( a );
        show(z);
    }
    public static <T>  void show(T[] t) {
        if(t!= null){
            StringBuffer sb = new StringBuffer("[");
            for (int i = 0; i < t.length; i++) {
                sb.append(t[i]).append(i==t.length-1?"]":",");

            }
            System.out.println(sb);
        }
    }
}

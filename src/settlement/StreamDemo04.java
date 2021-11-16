package settlement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author li'zi'yao
 */
public class StreamDemo04 {
    public static double allMoney ;
    public static  double allMoney1 ;
    public static double allMoney2 ;

    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("猪八戒",'男',30000 , 25000, null));
        one.add(new Employee("孙悟空",'男',25000 , 1000, "顶撞上司"));
        one.add(new Employee("沙僧",'男',20000 , 20000, null));
        one.add(new Employee("小白龙",'男',20000 , 25000, null));

        List<Employee> two = new ArrayList<>();
        two.add(new Employee("武松",'男',15000 , 9000, null));
        two.add(new Employee("李逵",'男',20000 , 10000, null));
        two.add(new Employee("西门庆",'男',50000 , 100000, "被打"));
        two.add(new Employee("潘金莲",'女',3500 , 1000, "被打"));
        two.add(new Employee("武大郎",'女',20000 , 0, "下毒"));

        // 1、开发一部的最高工资的员工。（API）
        // 指定大小规则了
        Topperformer ss = one.stream().max((e1, e2) -> Double.compare(e1.getBonus() + e1.getSalary(), e2.getBonus() + e2.getSalary())).map(s -> new Topperformer(s.getName(), s.getBonus() + s.getSalary())).get();
        System.out.println(ss);
        Topperformer zz = two.stream().max((e1, e2) -> Double.compare(e1.getBonus() + e1.getSalary(), e2.getBonus() + e2.getSalary())).map(s -> new Topperformer(s.getName(), s.getBonus() + s.getSalary())).get();
        System.out.println(zz);


        // 2、统计平均工资，去掉最高工资和最低工资
        one.stream().sorted((e1, e2) -> Double.compare(e1.getBonus() + e1.getSalary(), e2.getBonus() + e2.getSalary())).skip(1).limit(one.size()-2).forEach(s->{
            allMoney = allMoney+(s.getSalary()+s.getBonus());
        });
        System.out.println(allMoney/2);
        two.stream().sorted((e1, e2) -> Double.compare(e1.getBonus() + e1.getSalary(), e2.getBonus() + e2.getSalary())).skip(1).limit(one.size()-2).forEach(s->{
            allMoney1 = allMoney1+(s.getSalary()+s.getBonus());
        });
        System.out.println(allMoney1/2);

        // 3、合并2个集合流，再统计
        Stream<Employee> stream1 = one.stream();
        Stream<Employee> stream2 = two.stream();
        Stream<Employee> concat = Stream.concat(stream1, stream2);
        concat.sorted((e1, e2) -> Double.compare(e1.getBonus() + e1.getSalary(), e2.getBonus()+ e2.getSalary())).skip(1).limit(one.size()+ two.size()-2).forEach(s->{
            allMoney2 += (s.getSalary()+s.getBonus());
        });

        // 求出总和：剩余员工的工资总和

        // BigDecimal
        BigDecimal a =BigDecimal.valueOf(allMoney2);
        BigDecimal c = BigDecimal.valueOf(one.size()+two.size()-2);
        System.out.println(a.divide(c,2, RoundingMode.HALF_UP));
        }
}

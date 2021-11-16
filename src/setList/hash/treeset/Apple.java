package setList.hash.treeset;

/**
 * @author li'zi'yao
 */
public class Apple  implements Comparable<Apple>{
    private String name ;
    private String color ;
    private double price ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Apple() {
    }

    public Apple(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Apple o) {
        //会去掉重复项
//        return (int) (this.price - o.price);
        //不会去掉重复项
        return  (this.price - o.price)>=0?1:-1;

    }
}

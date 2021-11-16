package playingCards;

/**
 * @author li'zi'yao
 */
public class Card {

    private String num;
    private String color;
    private int index;

    public Card(String num, String color, int index) {
        this.num = num;
        this.color = color;
        this.index = index;
    }

    public Card() {
    }

    public Card(String num, String color) {
        this.num = num;
        this.color = color;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return num + color;
    }
}

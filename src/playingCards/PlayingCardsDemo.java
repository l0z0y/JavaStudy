package playingCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

/**
 * @author li'zi'yao
 */
public class PlayingCardsDemo {
    public static List<Card> ca = new ArrayList<>();

    static {
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] color = {"♠", "♥", "♣", "♦"};
        int index = 1;
        for (String s : num) {
            index++;
            for (String value : color) {
                Card c = new Card(s, value, index);
                ca.add(c);
            }

        }
        Card c1 = new Card("", "🃏", ++index);
        Card c2 = new Card("", "👲", ++index);
        Collections.addAll(ca, c1, c2);
        System.out.println(ca);
    }

    public static void main(String[] args) {
        Collections.shuffle(ca);
        System.out.println(ca);
        List<Card> linhuchong = new ArrayList<>();
        List<Card> jiumozhi = new ArrayList<>();
        List<Card> renyingying = new ArrayList<>();
        for (int i = 0; i < (ca.size() - 3); i++) {
            Card c = ca.get(i);
            if (i % 3 == 0) {
                linhuchong.add(c);
            } else if (i % 3 == 1) {
                jiumozhi.add(c);
            } else {
                renyingying.add(c);
            }

        }
        List<Card> last = ca.subList(ca.size() - 3, ca.size());
        System.out.println();
        sortCard(linhuchong);
        sortCard(jiumozhi);
        sortCard(renyingying);
        System.out.println(linhuchong);
        System.out.println(jiumozhi);
        System.out.println(renyingying);
        Scanner sc = new Scanner(System.in);
        System.out.println("输入1,2,3抢地主");

        int z = sc.nextInt();
        switch (z) {
            case 0 -> exit(0);
            case 1 -> linhuchong.addAll(last);
            case 2 -> jiumozhi.addAll(last);
            case 3 -> renyingying.addAll(last);
            default -> System.out.println("输入有误");
        }
        System.out.println(linhuchong);
        System.out.println(jiumozhi);
        System.out.println(renyingying);

    }

    public static void sortCard(List<Card> ca) {
        Collections.sort(ca, (o1, o2) -> (o2.getIndex() - (o1.getIndex())));
    }


}

package statisticalVoting;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author li'zi'yao
 */
public class StatisticalVotingDemo {
    public static void main(String[] args) {
        String[] s = {"A", "B", "C", "D"};
        StringBuffer sb = new StringBuffer();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(s[r.nextInt(s.length)]);
        }
        System.out.println(sb);

        Map<Character, Integer> inf = new HashMap<>();

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (inf.containsKey(c)) {
                inf.put(c, inf.get(c) + 1);

            } else {
                inf.put(c, 1);
            }


        }
        System.out.println(inf.values());


    }
}

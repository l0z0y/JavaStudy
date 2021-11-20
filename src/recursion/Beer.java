package recursion;

public class Beer {

        // 定义一个静态的成员变量用于存储可以买的酒数量

        public static int totalNumber;
        public static int lastBottleNumber;
        public static int lastCoverNumber;


        public static void main(String[] args) {
            // 1、拿钱买酒
            buy(10);
            System.out.println("总数：" + totalNumber);
            System.out.println("剩余盖子数：" + lastCoverNumber);
            System.out.println("剩余瓶子数：" + lastBottleNumber);
        }

        public static void buy(int money){
            // 2、看可以立马买多少瓶
            int buyNumber = money / 2;
            totalNumber += buyNumber;

            // 3、把盖子 和瓶子换算成钱
            // 统计本轮总的盖子数  和 瓶子数
            int coverNumber = lastCoverNumber + buyNumber;
            int bottleNumber = lastBottleNumber + buyNumber;

            // 统计可以换算的钱
            int allMoney = 0;
            if(coverNumber >= 4){
                allMoney += (coverNumber / 4) * 2;
            }
            lastCoverNumber = coverNumber % 4;

            if(bottleNumber >= 2){
                allMoney += (bottleNumber / 2) * 2;
            }
            lastBottleNumber = bottleNumber % 2;

            if(allMoney >= 2){
                buy(allMoney);
            }


        }
    }


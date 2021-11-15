package ATMsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * @author li'zi'yao
 */
public class AtmConfiguration extends Account {


    public void register(ArrayList<Account> ac) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====欢迎进入开卡界面=====");
        System.out.println("请输入你的名字");
        String name = sc.next();
        String password;
        String password1;
        while (true) {
            System.out.println("请输入你的密码");
            password = sc.next();
            System.out.println("请再次输入密码");
            password1 = sc.next();
            if (password.equals(password1)) {
                break;
            } else {
                System.out.println("两次密码输入不一致");
            }
        }
        System.out.println("请设置当日限额");
        int withdrawalAmount = sc.nextInt();
        String num = cardNmu();
        String num2 = checkCardNum(num, ac);
        Account yh = new Account(name, num2, 0, password, withdrawalAmount);
        ac.add(yh);


    }

    public String cardNmu() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            Random c = new Random();
            int z = c.nextInt(1, 10);
            String num = String.valueOf(z);
            s.append(z);

        }
        return String.valueOf(s);
    }

    public String checkCardNum(String num, ArrayList<Account> ac) {

        while (true) {
            if (ac.size() != 0) {
                for (int i = 0; i < ac.size(); i++) {
                    if (ac.get(i).getCardNumber().equals(num)) {
                        num = cardNmu();
                    }
                }
                System.out.println("开卡成功，你的卡号是" + num);
                break;

            } else {
                System.out.println("开卡成功，你的卡号是" + num);
                break;
            }
        }
        return num;
    }


    public void logIn(ArrayList<Account> ac) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的卡号");
        String user = sc.next();
        System.out.println("请输入你的密码");
        String password = sc.next();
        if (ac.size() == 0) {
            System.out.println("未查询到");
        } else {

            for (int i = 0; i < ac.size(); i++) {
                if (ac.get(i).getCardNumber().equals(user) && ac.get(i).getPassWord().equals(password)) {
                    loginInterface(i, ac);
                    break;
                } else if (i == ac.size() - 1) {
                    System.out.println("输入有误");
                }
            }
        }

    }


    public void loginInterface(int i, ArrayList<Account> ac) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====欢迎进入用户界面=====");

        label:
        while (true) {
            System.out.println("请输入你要进行的操作");
            System.out.println("1 查询");
            System.out.println("2 存款");
            System.out.println("3 取款");
            System.out.println("4 转账");
            System.out.println("5 退出账户");
            int i1 = scanner.nextInt();
            switch (i1) {
                case 1:
                    System.out.println("你的账户信息如下");
                    System.out.println("卡号" + ac.get(i).getCardNumber());
                    System.out.println("姓名" + ac.get(i).getName());
                    System.out.println("余额" + ac.get(i).getBalance());
                    System.out.println("取现限额" + ac.get(i).getWithdrawalAmount());
                    break;
                case 2:
                    System.out.println("请输入你的存款金额");
                    double money = scanner.nextDouble();
                    ac.get(i).setBalance(money + ac.get(i).getBalance());
                    System.out.println("存款成功");
                    break;
                case 3:
                    System.out.println("请输入你要取走的金额");
                    double money1 = scanner.nextDouble();
                    if (ac.get(i).getBalance() > (money1)) {
                        ac.get(i).setBalance(ac.get(i).getBalance() - money1);
                    } else {
                        System.out.println("你的存款不足");
                    }
                    break;
                case 4:
                    transfer(i, ac);
                    break;
                case 5:
                    break label;
                default:
                    System.out.println("输入有误请重新输入");

            }
        }


    }

    public void transfer(int i, ArrayList<Account> ac) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要转账的账号");
        String cardNmu = sc.next();
        for (int i1 = 0; i1 < ac.size(); i1++) {
            if (ac.get(i1).getCardNumber().equals(cardNmu)) {
                System.out.println("请输入你要转账的金额");
                double money = sc.nextDouble();
                if (ac.get(i).getBalance() > (money)) {
                    ac.get(i).setBalance(ac.get(i).getBalance() - money);
                    ac.get(i1).setBalance(ac.get(i1).getBalance() + money);
                } else {
                    System.out.println("你的存款不足");
                }
                break;

            } else if (i1 == ac.size()-1) {
                System.out.println("输入的账户有误");
                break;
            }
        }
    }


}

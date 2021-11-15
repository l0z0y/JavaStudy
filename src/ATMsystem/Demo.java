package ATMsystem;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Account> ac = new ArrayList<Account>();
        showMain(ac);


    }

    public static void showMain(ArrayList<Account> ac) {
        AtmConfiguration z = new AtmConfiguration();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=====欢迎进入ATM系统=====");
            System.out.println("1 登录账户");
            System.out.println("2 注册开户");
            System.out.println("3 退出系统");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    z.logIn(ac);


                    break;
                case 2:
                    z.register(ac);


                    break;
                case 3:
                    exit(0);
                default:
                    System.out.println("输入有误，请重新输入");


            }
        }
    }
}


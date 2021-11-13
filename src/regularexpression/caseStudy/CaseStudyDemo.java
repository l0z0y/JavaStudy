package regularexpression.caseStudy;

import java.util.Scanner;

/**
 * @author li'zi'yao
 */
public class CaseStudyDemo {
    public static void main(String[] args) {
        checkNum();
        checkEmail();
        checkTel();
        checkMoney();

    }

    public static void checkNum() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的电话号码");
            String number = sc.next();
            if (number.matches("1[3-9]\\d{9}")) {
                break;
            } else {
                System.out.println("输入有误");

            }

        }
    }

    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的邮箱");
            String email = sc.next();
            if (email.matches("\\w{1,30}@[a-zA-Z0-9]{2,10}(\\.[a-zA-Z0-9]{2,10}){1,10}")) {
                break;

            } else {
                System.out.println("输入有误");

            }

        }
    }
    public static void checkTel() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入你的座机号码");
            String number = sc.next();
            if (number.matches("(0\\d{2,6}-)?\\d{5,20}")) {
                System.out.println("注册成功");
                break;
            } else {
                System.out.println("输入有误");

            }

        }
    }
    public static void checkMoney() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入你的金额");
            String number = sc.next();
            if (number.matches("[0-9]{1,100}(\\.\\d{1,2})?")) {
                System.out.println("存入成功");

            } else {
                System.out.println("输入有误");

            }

        }
    }
}

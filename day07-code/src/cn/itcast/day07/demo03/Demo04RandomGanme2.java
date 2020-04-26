package cn.itcast.day07.demo03;
/*猜数字游戏，只有十次机会*/
import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGanme2 {

    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;

        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入数字");
            int guessNum = sc.nextInt();

            if (guessNum > randomNum) {
                System.out.println("你输入的数字大了，请重试");
            } else if (guessNum < randomNum) {
                System.out.println("你输入的数字小了，请重试");
            } else {
                System.out.println("猜对了");
            }
        }
        System.out.println("游戏结束");
    }
}

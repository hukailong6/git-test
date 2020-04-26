package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {

    public static void main(String[] args) {
        Random r = new Random();                //定义Random方法
        int randomNum = r.nextInt(100) + 1;      //随机产生一个1-100内的数字
        Scanner sc = new Scanner(System.in);      //定义Scanner方法

        while (true) {
            System.out.println("请输入数字：");
            int guessNum = sc.nextInt();

            if (guessNum > randomNum) {
                System.out.println("你输入的数字大了，请重试");
            } else if (guessNum < randomNum) {
                System.out.println("你输入的数字小了，请重试");
            } else {
                System.out.println("输入正确");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}

package cn.itcast.day07.demo01;
import java.util.Scanner;   //导包Scanner类
public class Demo01Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //创建一个名为sc的Scanner对象方法
        int sum = sc.nextInt();     //单独调用有返回值，int num 来接收返回值
        System.out.println("你输入的是" + sum);
        String str = sc.next();     //单独调用有返回值，String str 来接收返回值
        System.out.println("你输入的字符串是" + str);
    }
}

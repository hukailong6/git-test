package cn.itcast.day07.demo01;
import java.util.Scanner;   //导包Scanner类
public class Demo02ScannerSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //创建一个Scanner对象
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("结果是" + result);
    }
}

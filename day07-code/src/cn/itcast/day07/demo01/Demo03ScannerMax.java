package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //创建对象
        int a = sc.nextInt();                       //有返回值，用int a 来接收返回值
        int b = sc.nextInt();
        int c = sc.nextInt();

        //自己做的方法
        /*int[] array = {a, b, c};                    //定义一个array静态数组，包含a, b. c
        int max = array[0];                         //定义一个max，把数组第0号元素，赋值给max
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }*/

        //两两比较
        int tempe = a > b ? a : b;
        int max = tempe > c ? tempe : c;

        //if语句法...

        System.out.println("最大值：" + max);
    }
}
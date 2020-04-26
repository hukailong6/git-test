package cn.itcast.day07.demo03;
/*使用三个步骤：
 * 1.导包
 * 2.创建
 * 3.使用
 * nextInt（）小括号留空， 代表获取一个随机数字（范围是int所有范围，由正负两种）
 * nextInt(3)参数代表了范围，左闭右开。 代表[0,3）也就是取0~ 2*/

import java.util.Random;    //导包Random类

public class Demo01Random {

    public static void main(String[] args) {
        Random r = new Random();    //创建Random对象
        int num = r.nextInt();      //生成随机数字，用num来接受Random返回值
        System.out.println("输出的是：" + num);
    }
}

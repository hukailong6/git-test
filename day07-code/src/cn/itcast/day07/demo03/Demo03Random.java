package cn.itcast.day07.demo03;
//获取1-n之间的随机数，包括n

import java.util.Random;

public class Demo03Random {

    public static void main(String[] args) {
        Random r = new Random();
        int i = 5;
        for (int i1 = 0; i1 < 100; i1++) {
            int num = r.nextInt(i) + 1;     //生成随机数后 + 1 ， 必须在外面 + 1 ;
            System.out.println(num);        //nextInt(i + 1)就会变成随机取0-（i+1）之间的数字
        }
    }
}

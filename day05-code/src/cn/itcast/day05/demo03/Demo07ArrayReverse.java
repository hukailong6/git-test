package cn.itcast.day05.demo03;

public class Demo07ArrayReverse {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-------------------");

        for(int a = 0, b = array.length - 1; a < b; a++, b--){
            /*int temp = a;
            a = b;
            b = temp;*/         //只是思路， 在循环中要写变量
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

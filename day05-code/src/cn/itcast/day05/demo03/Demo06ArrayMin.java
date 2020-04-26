package cn.itcast.day05.demo03;

public class Demo06ArrayMin {


    public static void main(String[] args) {
        int[] array = {5, 10, 15, 30, 20, 10000};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值是" + max);
    }

    /*public static void main(String[] args) {
        int[] array = {5, 15, 20, 30, 20, 10000};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("最小值是：" + min);
    }*/
   /* public static void main(String[] args) {
        int[] array = {5, 15, 20, 30, 20, 10000};
        int min = array[1];
        for (int i = 0; i > array.length; i++) {        错误
            if(min < array[i]){
                min = array[i];
            }
        }
        System.out.println("最小值是：" + min);
    }*/
}






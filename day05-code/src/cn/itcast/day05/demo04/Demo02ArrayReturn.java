package cn.itcast.day05.demo04;

public class Demo02ArrayReturn {

    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println(result);
        System.out.println(result[0]);
    }

    public static int[] calculate(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum / 3;
        int[] abc = {sum, avg};
        System.out.println("地址值"+ abc);
        return abc;

    }
}

package cn.itcase.day06.demo02;

public class Demo05PhoneReturn {

    public static void main(String[] args) {
        Phone two = getPhone();     //赋值调用。two中的地址值是从方法返回值当中接收的
        System.out.println(two.brand);//苹果
        System.out.println(two.price);//8388.0;
        System.out.println(two.color);//玫瑰金
    }

    public static Phone getPhone(){
        Phone one = new Phone();    //创建一个对象
        one.brand = "苹果";         //赋值
        one.price = 8388.0;
        one.color = "玫瑰金";
        return one;                //谁调用我，把one地址值交给谁
    }
}

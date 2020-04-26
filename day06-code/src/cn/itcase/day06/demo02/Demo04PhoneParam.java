package cn.itcase.day06.demo02;

public class Demo04PhoneParam {

    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "土豪金";
        method(one);    //调用method方法，参数one，one保存的是地址值，传递进去的就是地址值
    }
    public static void method(Phone param){
        System.out.println(param.brand); //苹果
        System.out.println(param.price);
        System.out.println(param.color);
    }
}

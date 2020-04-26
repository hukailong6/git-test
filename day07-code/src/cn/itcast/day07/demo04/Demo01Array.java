package cn.itcast.day07.demo04;

/*题目
 * 定义一个数组，用来存储三个Person对象*/
public class Demo01Array {

    public static void main(String[] args) {
//        首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];
        System.out.println(array[0]);

        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 28);
        Person three = new Person("马儿扎哈", 38);
//        one中存储的是地址值
//        System.out.println(one);
        //将one当中的地址值赋值到0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}

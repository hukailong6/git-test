package cn.itcast.day07.demo02;

/*创建对象的标准格式：类名称 对象名 = new 类名称();
 *
 * 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
 * new 类名称();
 * 注意事项：匿名对象只能使用唯一的一次，下次再使用不得不再创建一个新对象
 * 使用建议：如果确定有一个对象只需要使用唯一的一次，就可以使用匿名变量*/
public class Demo01Anonymous {

    public static void main(String[] args) {
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();

        //匿名对象
        new Person().name = "赵又廷";//匿名对象赋值
        new Person().showName();    //匿名对象只能使用唯一的一次。全新成员变量null
    }
}

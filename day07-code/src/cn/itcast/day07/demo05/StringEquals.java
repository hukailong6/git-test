package cn.itcast.day07.demo05;

public class StringEquals {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));


    }
}

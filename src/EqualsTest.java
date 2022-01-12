package src;

import java.nio.charset.StandardCharsets;

/**
 * @author: bigdream
 * @since: 2022/1/7 10:50
 * @desc:  == 对于基本类型来说是值比较，对于引用类型来说是比较的是引用；而 equals 默认情况下是引用比较，
 * 只是很多类重写了 equals 方法，比如 String、Integer 等把它变成了值比较，
 * 所以一般情况下 equals 比较的是值是否相等。
 **/
class Cat{
    String name;

    Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        String str1 = new String("喵~");
        String str2 = new String("喵~");
        Cat cat1 = new Cat("喵~");
        Cat cat2 = new Cat("喵~");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equals(str2));
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat1.equals(cat2));

        byte[] array = "ABCDEFFGHIJKLMNOPQRSTUVWXYZ#abcdefghijklmnopqrstuvwxyz".getBytes();
        for (byte b:array){
            System.out.println(b);
        }
    }
}

package src;

import java.nio.charset.StandardCharsets;
/**
 * @author: bigdream
 * @since: 2022/1/7 17:30
 * @desc: String常用方法测试
 **/
public class StringMethodsTest {
    public static void main(String[] args) {
        String string = " ABCD_abcd  ";
        System.out.println(string.substring(2));
        String[] strings = string.split("_");
        for(String str:strings){
            System.out.println(str);
        }
        System.out.println(string.indexOf("_"));
        System.out.println(string.trim());
        System.out.println("======================================");
        byte[] bytes = string.getBytes(StandardCharsets.UTF_8);
        for (byte b: bytes) {
            System.out.println(b);
        }
    }
}

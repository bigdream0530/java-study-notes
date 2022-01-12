package src;

import java.util.Scanner;

/**
 * @author: bigdream
 * @since: 2022/1/7 11:24
 * @desc: 字符串反转
 **/
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str = "";
            str = scanner.nextLine();
            System.out.println(charAtReverse(str));
            System.out.println(StringBufferReverse(str));
            System.out.println(recursiveReverse(str));
        }
    }
    // charAt()方法
    public static String charAtReverse(String str){
        if(str == null || "".equals(str)){
            return "";
        }
        String newString = "";
        for(int i=str.length()-1;i >= 0;i--){
            newString += str.charAt(i);
        }
        return newString;
    }
    // StringBuffer的reverse方法
    public static String StringBufferReverse(String str){
        if(str == null || "".equals(str)){
            return "";
        }
        StringBuffer newString = new StringBuffer(str);
        return newString.reverse().toString();
    }
    // 利用递归的方法,类似与二分查找的折半思想
    public static String recursiveReverse(String str){
        int length = str.length();
        if(length <= 1){
            return str;
        }
        String left = str.substring(0,length/2);
        String right = str.substring(length/2,length);
        return recursiveReverse(right) + recursiveReverse(left);

    }
}

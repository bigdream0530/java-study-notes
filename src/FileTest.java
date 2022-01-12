package src;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author: bigdream
 * @since: 2022/1/7 17:30
 * @desc: 文件操作测试
 **/
public class FileTest {

    private static final long timeout = (long) 1000.00;
    private static final int nanos = 5;

    public static void main(String[] args) throws Exception {

        // 创建文件的完整路径
        String path = "E:\\ThePerfectWorld.txt";
        // 根据路径创建文件对象
        File file = new File(path);
        // 读取
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(path), "GBK");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            String text = bufferedReader.readLine();
            System.out.println(text);
            Thread.sleep(100);
        }
    }
}

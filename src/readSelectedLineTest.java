package src;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author: bigdream
 * @since: 2022/1/10 17:54
 * @desc: 读取txt文件指定行
 **/
public class readSelectedLineTest {
    public static void main(String[] args) throws Exception{
        String fileName = "E://ThePerfectWorld.txt";
        int totalNo = getTotalLines(fileName);
        System.out.println("共"+totalNo+"行");
        while(true){
            Scanner sc = new Scanner(System.in);
            int lineNumber = sc.nextInt();
            readLineVarFile(fileName,lineNumber);
            while(true){
                lineNumber++;
                readLineVarFile(fileName,lineNumber);
                Thread.sleep(100);
            }
        }
    }
    static void readLineVarFile(String fileName, int lineNumber) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"GBK"));
        String line = reader.readLine();
        if(lineNumber <= 0 || lineNumber > getTotalLines(fileName)){

        }else {
            int num = 0;
            while (line != null){
                if(lineNumber == ++num){
                    System.out.println(line);
                }
                line = reader.readLine();
            }
            reader.close();
        }

    }
    static int getTotalLines(String fileName) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        LineNumberReader reader = new LineNumberReader(br);
        String s = reader.readLine();
        int lines = 0;
        while (s != null) {
            lines++;
            s = reader.readLine();

        }
        reader.close();
        br.close();
        return lines;

    }
}

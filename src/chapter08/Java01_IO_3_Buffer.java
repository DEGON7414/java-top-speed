package chapter08;

import java.io.*;

public class Java01_IO_3_Buffer {

    public static void main(String[] args) {
        //TODO 緩衝
        //資料源
        File srcFile = new File("C:\\java-top-speed\\java-top-speed\\src\\chapter08\\test.txt");
        //目的地(自動生成)
        File destFile = new File("C:\\java-top-speed\\java-top-speed\\src\\chapter08\\test.txt.copy");
        //TODO 緩衝區(水桶)
        byte[] catche = new byte[1024];

        try (//文件輸入流(管道物件)
             FileInputStream in = new FileInputStream(srcFile);
             //文件輸出流(管道物件)
             FileOutputStream out = new FileOutputStream(destFile);
             //TODO buffer 緩衝輸入 管道
             BufferedInputStream bis = new BufferedInputStream(in);
             //TODO buffer 緩衝輸出 管道
             BufferedOutputStream bos = new BufferedOutputStream(out);) {

            int data ;
            while ((data = bis.read(catche)) != -1) {
                //從緩衝區索引0 -data 寫入到bos
                bos.write(catche, 0, data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

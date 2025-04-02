package chapter08;

import java.io.*;

public class Java01_IO_5_Serializaion {

    public static void main(String[] args) {
        //TODO Serialization  序列化
        //把物件轉成 byte
        //反序列化 就是把byte 轉成物件
        //只有使用序列化接口才能進行序列化
        //ObjectOutputStream 將物件寫入檔案
        //ObjectInputStream 從檔案讀取物件
        // 1. 創建一個 StringBuilder 物件
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, World!");

        // 序列化：將物件儲存到檔案
        // 1. 創建檔案輸出流
        FileOutputStream fileOut = null;
        ObjectOutputStream oos = null;
        try {
            fileOut = new FileOutputStream("C:\\java-top-speed\\java-top-speed\\src\\chapter08\\StringBuilder.ser");  // 創建 FileOutputStream
            oos = new ObjectOutputStream(fileOut);  // 把 FileOutputStream 包裝成 ObjectOutputStream
            oos.writeObject(sb);  // 儲存物件
            System.out.println("物件已儲存到檔案。");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();  // 關閉 ObjectOutputStream
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOut != null) {
                try {
                    fileOut.close();  // 關閉 FileOutputStream
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //TODO 反序列化
        // 1. 創建檔案輸入流
        FileInputStream fileIn = null;
        ObjectInputStream ois = null;
        try {
            // 創建 FileInputStream，讀取指定的檔案
            fileIn = new FileInputStream("C:\\java-top-speed\\java-top-speed\\src\\chapter08\\StringBuilder.ser");
            ois = new ObjectInputStream(fileIn);  // 把 FileInputStream 包裝成 ObjectInputStream

            // 讀取反序列化的物件
            StringBuilder sbRead = (StringBuilder) ois.readObject();  // 讀取物件並轉型
            System.out.println("讀取的物件內容：" + sbRead.toString());  // 顯示反序列化後的內容
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();  // 關閉 ObjectInputStream
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileIn != null) {
                try {
                    fileIn.close();  // 關閉 FileInputStream
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}






package chapter08;

import java.io.*;

public class Java01_IO_5_Serializaion {

    public static void main(String[] args) {
        //TODO Serialization  序列化
        //把物件轉成 byte
        //只有使用序列化接口才能進行序列化
        //ObjectOutputStream 將物件寫入檔案
        //輸出後有亂碼正常 因為這裡是byte二進制的格式
        // 1. 創建一個String物件
        String sb = "Hello, World!";
        try (//1.創建FileOutStream用來寫檔案
             FileOutputStream fileOut = new FileOutputStream("C:\\java-top-speed\\java-top-speed\\src\\chapter08\\String.txt");
             //2.用 ObjectOutputStream 包裝 FileOutputStream，讓它能夠將物件寫入檔案
             ObjectOutputStream oos = new ObjectOutputStream(fileOut);){

            oos.writeObject(sb);  // 儲存物件
            System.out.println("物件已儲存到檔案。");
        } catch (IOException e) {
            e.printStackTrace();
        }
            }
    }







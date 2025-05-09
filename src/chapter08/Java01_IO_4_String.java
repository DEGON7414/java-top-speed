package chapter08;

import java.io.*;

public class Java01_IO_4_String {

	public static void main(String[] args) {
		//TODO StringBuilder
		//允許對字串進行修改、添加、刪除內容
		//避免每次修改都要新建String 物件
		//讀取寫入時都可以用此

		//資料源
		File srcFile = new File("C:\\java-top-speed\\java-top-speed\\src\\chapter08\\test.txt");
		//目的地(自動生成)
		File destFile = new File("C:\\java-top-speed\\java-top-speed\\src\\chapter08\\test.txt.copy");
		//TODO 緩衝區(水桶)
		byte[] catche = new byte[1024];
		//TODO 建立StringBuilder
		StringBuilder stringBuilder = new StringBuilder();

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
				//從緩衝區 範圍索引0 -data 寫入到目的地
				bos.write(catche, 0, data);
				//byte[] 轉換成字串
				String s = new String(catche, 0, data);
				//一個一個拼接成stringBuilder
				stringBuilder.append(s);
			}
			System.out.println(stringBuilder.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	}






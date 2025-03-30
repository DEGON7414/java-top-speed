package chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class Java01_IO_2 {

	public static void main(String[] args)  {
		//TODO 文件複製
		
		//資料源
		File srcFile = new File("C:\\Users\\許記源\\git\\java-top-speed\\src\\chapter08\\test.txt");
		
		//目的地(自動生成)
		File destFile = new File("C:\\Users\\許記源\\git\\java-top-speed\\src\\chapter08\\test.txt.copy");
		
		//文件輸入流(管道物件)
		FileInputStream in = null;
		
		//文件輸出流(管道物件)
		FileOutputStream out = null;
		try {
			in = new FileInputStream(srcFile);
			out = new FileOutputStream(destFile);
			
			//打開閥門 流轉資料
			//每通過一個資料(以這份檔案來說 也就只有HELLO 中的H) 他就會關閉閥門
			//-1 代表讀完讀不到資料
			int data = in.read();
//			out.write(data);
//			
//			data = in.read();
//			out.write(data);
//			
//			data = in.read();
//			out.write(data);
//			
//			data = in.read();
//			out.write(data);
//			
//			data = in.read();
//			out.write(data);
//		
//			if (data !=-1 ) {
//				out.write(data);
//			}
			while ((data = in.read()) !=-1) {
				out.write(data);
			}
			
		} catch (IOException e) {
			 e.printStackTrace();
			 
		}finally {
			if (in != null) {
				try {
					in.close();
					}catch (Exception e) {
						throw new RuntimeException(e);
					}
			}
			if (out != null) {
				try {
					out.close();
					}catch (Exception e) {
						throw new RuntimeException(e);
					}
			}
		}
		
	}	

}

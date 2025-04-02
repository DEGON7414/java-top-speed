package chapter08;

import java.io.*;

public class Java01_IO_3_Buffer {

	public static void main(String[] args)  {
		//TODO 緩衝
		
		//資料源
		File srcFile = new File("C:\\java-top-speed\\java-top-speed\\src\\chapter08\\test.txt");
		
		//目的地(自動生成)
		File destFile = new File("C:\\java-top-speed\\java-top-speed\\src\\chapter08\\test.txt.copy");
		
		//文件輸入流(管道物件)
		FileInputStream in = null;
		
		//文件輸出流(管道物件)
		FileOutputStream out = null;
		//TODO buffer 緩衝輸入 管道
		BufferedInputStream bis = null;

		//TODO buffer 緩衝輸出 管道
		BufferedOutputStream bos = null;
		//TODO 緩衝區(水桶)
		byte[] catche = new byte[1024];
		try {
			in = new FileInputStream(srcFile);
			out = new FileOutputStream(destFile);
			bis = new BufferedInputStream(in);
			bos = new BufferedOutputStream(out);
			
			//打開閥門 流轉資料
			//每通過一個資料(以這份檔案來說 也就只有HELLO 中的H) 他就會關閉閥門
			//-1 代表讀完讀不到資料
			int data = -1;
			while ((data = bis.read(catche)) != -1) {
				bos.write(catche, 0, data);
			}

			
		} catch (IOException e) {
			 e.printStackTrace();
			 
		}finally {
			if (bis != null) {
				try {
					bis.close();
					}catch (Exception e) {
						throw new RuntimeException(e);
					}
			}
			if (bos != null) {
				try {
					bos.close();
					}catch (Exception e) {
						throw new RuntimeException(e);
					}
			}
		}
		
	}	

}

package chapter08;

import java.io.File;
import java.io.IOException;

public class Java01_IO {

	public static void main(String[] args) throws IOException {
		//TODO 數據流轉操作
		//input 輸入 
		//Output 輸出
		//Stream 流轉
		
		//TODO FILE 文件類型 屬於java.io
		//創建文件物件 使用文件路徑 關係文件
		String filePath ="C:\\Users\\許記源\\git\\java-top-speed\\src\\chapter08\\test.txt";
		File file = new File(filePath);
		//輸出地址
		System.out.println(file);
		//判斷是否為檔案
		System.out.println(file.isFile());
		//判斷是否為一個資料夾
		System.out.println(file.isDirectory());
		//判斷文件是否存在
		System.out.println(file.exists());
		
		// TODO 文件對象存在的情況
		if ( file.exists() ) {
			   System.out.println("這個文件物件存在");
			   if (file.isFile()) {
			       System.out.println("file關聯的是一個檔案");
				   //1.取得name
			       System.out.println(file.getName());
				   //2.取得長度
			       System.out.println(file.length());
			       //3.最後修改時間
			       System.out.println(file.lastModified());
			       //4.路徑
			       System.out.println(file.getAbsolutePath());
				   //如果file關聯的是一個資料夾
			   } else if ( file.isDirectory() ) {
			       System.out.println("file關聯的是一個資料夾");
				   //1.取得name
			       System.out.println(file.getName());
				   //2.最後修改時間
			       System.out.println(file.lastModified());
				   //3.路徑
			       System.out.println(file.getAbsolutePath());
			       String[] list = file.list();
			       System.out.println("資料夾中的檔案");
			       for (String string : list) {
					System.out.println(string);
				}
			       System.out.println("資料夾中的文件物件");
				   //列出某個資料夾底下的所有檔案或子資料夾
			       File[] listFiles = file.listFiles();
			       for (File file2 : listFiles) {
					System.out.println(file2);
				}
			       
			   }
			} else {
			   // TODO 文件對象不存在的情況
			   System.out.println("file沒有關聯成功");
			   // TODO 創建資料夾
			   //file.mkdirs();
			   // TODO 創建新文件
			   //file.createNewFile();
			}
		
		
		
		
		
	}	

}

package chapter04;

import java.sql.SQLOutput;

public class Java02_Object_Method {
	public static void main(String[] args) {
		//TODO 物件導向 方法
		// 聲明
		// (返回值)void 方法名(){} void 代表沒有結果 也就是沒有回傳值
		// 返回值可以替換成 該方法該回傳東西的類型 EX boolean

		//方法調用:對象.方法名()

		//使用 用戶 帳號 密碼登入
		//名詞:用戶 帳號 密碼
		//動詞 登入

		User user = new User();
		boolean registerResult = user.register();
		//沒有 特別寫 就是 預設 =true
		//register true 登入 false
		if (registerResult) {
			System.out.println("註冊成功");
			boolean loginResult = user.login(); //false
			if (loginResult) {
				System.out.println("登入成功");
			}else {
				System.out.println("登入失敗");
			}
		}else{
			System.out.println("註冊失敗");

		}



	}
}
class User{
	String account;
	String password;
	boolean register(){
		System.out.println("用戶註冊");

		return true; //你有結果 那就不能用 void
	}
	boolean login(){
		System.out.println("用戶登入");
		return false;

	}
}

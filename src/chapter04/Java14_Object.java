package chapter04;

public class Java14_Object{
	public static void main(String[] args) {
			//TODO 物件導向
		//一個類中不能重複聲明相同方法名(相同參數)，但只要一個不同即可。
		//可以利用參數的不同來達到重載 OverLoading
		User14 user14 = new User14();
//		User14 user14 = new User14("狗鼻");

		user14.login("123","456");
		user14.login(00001320);
		user14.login("1234@gmail.com");
		//TODO 建構子也可以

	}
}
class User14{
	User14(){
			System.out.println("無參數");
		}

	User14(String name){
		System.out.println("參數: " + name);
	}
	void login(String account,String password){
		System.out.println("帳號密碼登入");
	}
	void login(int phone){
		System.out.println("手機號碼登入");

	}
	void login(String line){
		System.out.println("賴登入");

	}
}
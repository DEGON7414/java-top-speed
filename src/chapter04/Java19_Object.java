package chapter04;

public class Java19_Object {
	public static void main(String[] args) {
		// 單例模式 一個實例
		//使用場景: 1.類的構造複雜2.類的物件消耗資源
		User19 instance1 = User19.getInstance();
		User19 instance2 = User19.getInstance();
		User19 instance3 = User19.getInstance();
		User19 instance4 = User19.getInstance();
		User19 instance5 = User19.getInstance();
		User19 instance6 = User19.getInstance();
		User19 instance7 = User19.getInstance();
		System.out.println(instance1 == instance2);//比較地址
		System.out.println(instance1.equals(instance2) );


	}
}
class User19{
	private static User19 user19 = null;//靜態變數
	private User19() {//不讓外部用new建立物件

	}
	public  static User19 getInstance() {
		//執行方法時 沒有物件 就創建一個並且要 return
		if (user19 == null) {
			user19 = new User19();
		}
		return user19;
	}
}
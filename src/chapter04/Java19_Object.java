package chapter04;

public class Java19_Object {
	public static void main(String[] args) {
		// 單例模式 一個實例
		//使用場景: 1.類的構造複雜2.類的物件消耗資源
		User19 instance1 = User19.getInstance();
		User19 instance2 = User19.getInstance();

		System.out.println(instance1 == instance2);//比較地址
		System.out.println(instance1.equals(instance2) );
		//TODO 單例模式 步驟
		//1.私有化建構子
		//2.建立靜態變數 user19 = null
		//3.建立靜態方法 沒物件時要建立一個
		//4.所有變數都指向同一個物件

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
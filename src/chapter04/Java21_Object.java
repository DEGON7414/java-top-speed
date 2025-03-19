package chapter04;

public class Java21_Object {
	public static void main(String[] args) {
	//抽象類 不完整的類 只能定義方法名 沒有實作
		//不能建構物件
		// 關鍵字 abstract
		//abstract 返回值類型 方法名 (參數)
//		User21 user21 = new User21();User21 失敗不能建構物件。
		//類有抽象方法 肯定是抽象類
//		但是抽象類有實體法 是可以的
		//無法直接建構物件
//		但可以多通過子類間接創建物件
		//不能跟final 一起用
		User21 user21 = new UserEat();
		user21.eat();
	}

}
abstract  class  User21{
	public abstract  void eat ();
}
class UserEat extends User21{
@Override
public void eat() {
	System.out.println("1");
}
}

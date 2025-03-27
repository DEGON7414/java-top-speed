package chapter04;

public class Java17_Object_Access {
	public static void main(String[] args) {
		//TODO 權限
		//1.public 公共 大家都能用
		//2.default 預設 同一個package(路徑) 可以用
		//3.protect 保護 同package(路徑) 子類可以用
		//4.private 同一個類才能用
		User17 user17 = new User17();
		// 無法使用 因為private
//		user17.name = "XX";
		//測試 1 打開上面註解

	}
}
class User17{
	private String name;
}







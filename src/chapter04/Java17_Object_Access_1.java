package chapter04;

public class Java17_Object_Access_1 {
	public static void main(String[] args) {
		User17 user17 = new User17();
		//clone 方法是依個受保護方法 也就是 只有 同一個包的類 還有子類才能用
//		user17.clone();

	}
}
class User171{
	void test() throws Exception{
	clone();
}
}
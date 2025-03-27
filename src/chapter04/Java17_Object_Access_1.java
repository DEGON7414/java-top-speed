package chapter04;

public class Java17_Object_Access_1 {
	public static void main(String[] args) {
		User171 user171 = new User171();
		//clone 方法是依個受保護方法 也就是 只有 同一個包(lang包) 同類(object類)還有子類(內部)才能用
		//所以底下 User171類別繼承OBJECT 故他可以訪問clone
		// 但是不能夠開放給 別的類別調用 需要重新override

		//測試1 打開註解
//			user171.test();

	}
}
class User171{
	void test() throws Exception{
	clone();
}
}
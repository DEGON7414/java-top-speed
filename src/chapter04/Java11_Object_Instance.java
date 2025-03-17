package chapter04;

public class Java11_Object_Instance {
	public static void main(String[] args) {
		//TODO 構建
		//建構子 建構對象
		//如果沒設定 JVM會有無參數的
		//TODO 類名(){}
		//也是方法但沒回傳值
		//方法名= 類名
		//類中無建構子 JVM提供無參數
		//有的話 JVM則無提供
		//也是方法所以可以傳遞參數 但傳遞目的一般都是為了賦值
		System.out.println("Before");
		User11 user11 = new User11("JoJo");
//		User11 user11 = new User11();會錯 因為沒傳參數
		System.out.println("After");

		user11.test();
		System.out.println(user11.name);
		//TODO 代碼塊是在建構子之前執行的
	}

}
class  User11{
	String name;
	{
		System.out.println("代碼塊1"); // 有物件產生即優先啟動
	}


	User11(String name) {
		System.out.println(name);

	}
	void test (){
		System.out.println("test");
	}


}
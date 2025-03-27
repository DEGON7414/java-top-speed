package chapter04;

public class Java20_Object {
	public static void main(String[] args) {
		//TODO final
		//初始後不會修改值 修飾後變數也稱為常量
		//final可以修飾屬性 方法 類 變數
		//修飾方法的話 此方法不可被子類overrride
		//final 不能修飾建構子

		//測試1 底下 NAME 方法無法修改、繼承
		//測試2 打開c.name 報錯
		// 建構子方法不能加final 但可以透過修飾屬性+帶參數建構子固定值
		final String name = "Jack";
//		String name = "123";//會報錯
		User20 c = new User20("拉巴間");

		System.out.println(name);
		System.out.println(c.name);
//		c.name = "幫你間";

	}
}
class User20{
	public final String name;
	public User20(String name) {
		this.name = name;
	}
	final void test (){

	}
}
class  test extends User20{
	public test(String name) {
		super(name);
	}
//	//不能繼承
//	@Override
//	void test (){
//
//	}
}

package chapter04;

public class Java20_Object {
	public static void main(String[] args) {
		//TODO final
		//初始後不會修改值 修飾後變數也稱為常量
		//final可以修飾屬性 方法 類 變數
		//修飾方法的話 此方法不可被子類overrride
		//final 不能修飾建構子
		final String name = "Jack";
//		String name = "123";//會報錯
		User20 c = new User20("拉巴間");

		System.out.println(name);
		System.out.println(c.name);


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
//class  test extends User20{
//	不能繼承
//	@Override
//	void test (){
//
//	}


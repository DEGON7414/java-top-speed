package chapter04;

public class Java24_Object {
	public static void main(String[] args) {
		//TODO 匿名類
		//有些場合下我們只想要類中的功能或語法
		//匿名類  = 沒有名子的類
		Me me = new Me();
		//測試1
		//1.定義一個抽象類 內有抽象方法
		//2.正常類定義方法 其中傳入抽象類的物件
		//3.正常類物件 其中 填入參數為new 抽象類 並且實作抽象類方法
		me.say(new Person24() {
			@Override
			public String getName() {
				return "五條";
			}
		});
	}
}
abstract class Person24 {
	public abstract String getName();
}
class Me{
	public void say(Person24 person24){
		System.out.println("HELL"+person24.getName());
	}
}


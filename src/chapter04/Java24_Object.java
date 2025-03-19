package chapter04;

public class Java24_Object {
	public static void main(String[] args) {
		//TODO 匿名類
		//有些場合下我們只想要類中的功能或語法
		//匿名類  = 沒有名子的類
		Me me = new Me();
		//這裡無須有實現的類 用抽象類即可實現
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


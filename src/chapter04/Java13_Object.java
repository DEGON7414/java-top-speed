package chapter04;

public class Java13_Object{
	public static void main(String[] args) {
	//TODO 物件導向 多態
		//所謂多態就是一個物件在不同場景下表現出不同狀態和型態
		//多態 語法其事是對物件使用場景進行約束
		//「編譯看左邊，執行看右邊」
		Person person = new Person();
		person.testPerson();

		//此處 變數boy 用person 父類別 因此只能使用到父類別的方法
		Person boy = new Boy();
		boy.testPerson();
		//報錯 因為他只能呼叫到Person類別的方法
//		boy.testBoy();
		//測試1 . 上面boy.testPerson();
		//測試2   boy.testBoy();

	}
}
class Person {
	void testPerson(){
		System.out.println();
	}
}
class Boy extends Person {
	void testBoy(){
		System.out.println("巴巴BOY");
	}
}
class Girl extends Person {
	void testGirl(){
		System.out.println("女");
	}
}
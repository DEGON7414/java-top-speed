package chapter04;

public class Java15_Object {
	public static void main(String[] args) {
		//TODO Override
		//不代表父類被覆蓋 可以用super 調用
		//重寫 方法名(參數)要一樣

		Child15 child15 = 	new Child15();
		child15.test();
	}

}
class Parent15{
	String name = "AXIOS";
	void test(){
		System.out.println(name);
	}
}
class Child15 extends Parent15{
	String name = "JQUERY";
	@Override
	void test(){
//		super.test();
		System.out.println(name +" " +"child test");
	}
}







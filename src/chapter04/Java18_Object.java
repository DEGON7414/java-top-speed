package chapter04;

public class Java18_Object {
	public static void main(String[] args) {
			//TODO 內部類
		//可以當成屬性來用
		outerClass outerClass = new outerClass();
		//內部類建構要透過 外部類物件
		outerClass.innerClass innerClass = outerClass.new innerClass();
		innerClass.test();
	}
}
class outerClass {
	public class innerClass {
		void test(){
			System.out.println("innerClass");
		}
	}
}
package chapter04;

public class Java18_Object {
	public static void main(String[] args) {
		//TODO 內部類
		//可以當成屬性來用
		OuterClass outerClass = new OuterClass();

		//內部類建構要透過 外部類物件
//		outerClass.innerClass.test();
//		outerClass.InnerClass innerClass = outerClass.new InnerClass();
//		innerClass.test();

		//測試 1 直接print
		//測試 2 打開註解
		//報錯 因為 此時只有new外部物件 沒有內部物件 故無法呼叫內部類方法
	}
}
class OuterClass {
	public class InnerClass {
		void test(){
			System.out.println("innerClass");
		}
	}
}
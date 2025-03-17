package chapter04;

public class Java12_Object_Extends_1 {
	public static void main(String[] args) {
	//TODO 繼承
		//子類可以繼承父類的成員屬性和方法
		//可以多子但不能多父
		Child1 child1 = new Child1();
		child1.name = "ZOZO"; //如果這樣 super 也是輸出ZOZO 因為子類別沒有設定 name 屬性
		//這裡會修改繼承的父類屬性
		child1.test();
//		child1.test(super.name); super this 都代表是物件用的 在靜態方法、代碼塊中無法用



	}
}
class Parent1{
	String name = "JOJO";

//	void test(){
//		System.out.println(name);
//	}
}
class Child1 extends Parent1{
//	String name = "ZOZO";
	void test(){
		System.out.println(super.name);
		System.out.println(this.name);
		System.out.println(name);//預設this
	}
}
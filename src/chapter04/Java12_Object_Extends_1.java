package chapter04;

public class Java12_Object_Extends_1 {
	public static void main(String[] args) {
	//TODO 繼承
		//子類可以繼承父類的成員屬性和方法
		//可以多子但不能多父
		Child1 child1 = new Child1();
		child1.name = "ZOZO";
		child1.test();
		//1.測試 子類別test 方法
		// 子類別中有特別重新寫屬性name 輸出為JOJO、ZOZO、ZOZO

		//2.測試 子類別test 方法
		// 把子類屬性name 註解
		// 此時賦值會給到 父類別 name因此 輸出三個都是ZOZO
	}
}
class Parent1{
	String name = "JOJO";

}
class Child1 extends Parent1{
	//如果子類別沒有設定 name 屬性
	//這裡會修改繼承的父類屬性
//	String name = "ZOZO";
	void test(){
		System.out.println(super.name);
		System.out.println(this.name);
		System.out.println(name);//預設this
	}
}
package chapter04;

public class Java12_Object_Extends {
	public static void main(String[] args) {
	//TODO 繼承
		//子類可以繼承父類的成員屬性和方法
		//可以多子但不能多父
		Child child = new Child();
		child.name = "ZOZO";
		child.test();



	}
}
class Parent{
	String name = "JOJO";

	void test(){
		System.out.println(name);
	}
}
class Child extends Parent{

}
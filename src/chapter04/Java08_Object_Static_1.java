package chapter04;

public class Java08_Object_Static_1 {

	public static void main(String[] args) {
		//TODO 靜態
		Test t = new Test();
		t.test();
		//有物件 代表你有該類別資訊 自然可以用static 也可以操作
		t.test1();
		t.sex= "女";
		Test.test1();


	}
}
class Bird1 {

	static String type = "blue";
	static void fly() {
		System.out.println("上街");
	}
}
class Test{
	String name;
	static String sex;

	void test(){
		test1();
		System.out.println(sex);
		System.out.println("成員方法");
	}
	static void test1(){
		System.out.println("靜態方法");
//		test();
//		System.out.println("物件訪問:"+ name);
//		錯誤 因為靜態的不能訪問 物件的 屬性和方法
	}
}
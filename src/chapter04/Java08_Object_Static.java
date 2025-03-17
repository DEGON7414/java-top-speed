package chapter04;

public class Java08_Object_Static {
//commit
	
	public static void main(String[] args) {
		//TODO 靜態
		//針對具體物件的為 成員屬性、實例屬性 成員方法、實例方法
		//和物件無關 只和"類"相關的為靜態
		//靜態屬性、方法
		//語法就是 屬性 方法前 增加 static
		grass t = new grass();
//		grass t = null;
		t.name= "小草";
		//靜態方法可以 類別.方法直接調用 。
		Bird.fly();
		//靜態屬性 類別.屬性
		System.out.println(Bird.type);
	}
}
class Bird {

	static String type = "blue";
	static void fly() {
		System.out.println("上街");
	}
}
class  grass{
	String name;
}
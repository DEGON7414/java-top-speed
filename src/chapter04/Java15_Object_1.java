package chapter04;

public class Java15_Object_1 {
	public static void main(String[] args) {
		//TODO Override
//		CCC ccc = new CCC();
//		DDD ddd = new DDD();
		CCC ddd = new DDD(); //能用什麼方法 取決變量類型 這裡是CCC 可以用sum方法
							//方法怎麼用 取決物件 也就是new DDD
							//兩邊都有一樣的方法 所以 用DDD中的方法
							//我如果註解DDD中的sum 那就是用CCC的
							//但是屬性的使用是在 各自聲明的範圍 this
		System.out.println(ddd.sum());
	}

}
class CCC{
	int i = 10;
	int sum() {
		return i + 10;
	}
}
class DDD extends CCC{
	int i = 20;
	@Override
	int sum() {
		return i + 20;
	}
}







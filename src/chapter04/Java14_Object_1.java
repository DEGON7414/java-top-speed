package chapter04;

public class Java14_Object_1{
	public static void main(String[] args) {
		//TODO 在一個建構子中想要調用其他建構子 要用到this() 注意有()
		User141 user1 = new User141();
		//測試 1
		//無參數調用 name參數建構子 後者再調用 name sex建構子
		//運作上 和方法類似 後入 先出 因此結果是最後的建構子優先出來
	}
}
class User141{
	User141(){
		this("拉巴間");
		System.out.println("無參數");
		}

	User141(String name){
		this(name,"男"); //this調用當前物件 並且根據()賦值給屬性
		System.out.println("傳遞參數: " + name);
	}
	User141(String name,String sex){

		System.out.println("傳遞結果: " + name+" "+sex);
		//因為前面this 一直賦值給屬性 所以先到最後一個，故最後一個是最先顯示結果的。
	}

	}

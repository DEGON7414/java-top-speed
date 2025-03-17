package chapter04;

import java.util.Arrays;

public class Java07_Object_Method_Param {
	public static void main(String[] args) {
	//TODO 物件導向 方法
		//使用外部資料 來實現內部方法 此時外部資料為 方法參數
		//方法名(參數類型 參數名)
		//方法名(參數類型1 參數名1,參數類型2 參數名2)
		User07 user = new User07();
		String name = "KD";
		int age=37;
		user.sayHello(name,age);
//		user.sayHello(age,name);這樣會報錯 因為和方法定義不一樣
		//TODO 當方法需要傳遞多個參數時 需要注意
		//1. 參數個數要匹配
		//2.類型要匹配
		//3.順序要匹配
		//TODO 參數個數不確定 但類型相同可以使用 "可變參數"
		// 參數類型 ...參數名稱
		user.test(22,"Booker");
		user.test(23,"curry","LBJ","KD");
	}
}
class User07{

	void sayHello(String name,int age){
		System.out.println("hello "+name+" "+age);

	}
	//可變參數
	void test(int age,String... name){
		System.out.println(name);//此時直接print 陣列，因此輸出是陣列的記憶體內容
		System.out.println(Arrays.toString(name));//轉換處理成陣列

	}
}

package chapter04;

import java.util.Arrays;

public class Java07_Object_Method_Param_1 {
	public static void main(String[] args) {
	//TODO 物件導向 方法 參數
		int i = 1;
		test(i);
		System.out.println(i);//1 你在main方法中使用別的方法就是在開一個stack
		// 而你沒有將test方法的值回傳 所以還是1


		String s= "abc";
		test(s);
		System.out.println("s="+s);//abc
		//test執行時 值傳遞s 會創造第二個物件 abc+10但不會影響 到main方法的指向
		//main 中依然指向 abc物件
		//test 中的s 為該方法中的局部變數 用完即銷毀
		//同上

		User0 user = new User0();
		user.name = "幫你間";
		test(user);
		System.out.println("user.name="+user.name);
		//這裡是修改到物件本身的屬性 (HEAP區)因此可以修改成功
	}
	public static void test(int i){
		i=i+10;
	}
	public static void test(String s){
		s=s+10;
	}


	public static void test(User0 user){
		user.name = "喇叭間";
	}
}
class User0{
	String name;


}

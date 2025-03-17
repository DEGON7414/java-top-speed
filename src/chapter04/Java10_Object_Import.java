package chapter04;

import java.util.Date;//import 可以把類改成 * 這樣是全部

public class Java10_Object_Import {

	public static void main(String[] args) {
	//java.lang 不用引入 預設就有
		new Date();
		User08 user08 = new User08();// 同一個包的可以直接用
	}
}

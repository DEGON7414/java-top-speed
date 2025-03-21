package chapter04;

public class Java08_Object_Static_2 {

	public static void main(String[] args) {
		//TODO 靜態代碼塊
		//類訊息加載完 會自動使用 靜態代碼塊
		//應用 初始化
		//物件創立也會自動調用代碼 但不侷限 靜態
		//實例區塊是設計來初始化物件的屬性或者進行其他物件級的初始化工作。
		//實例區塊是在 建構子 被調用之前執行的，它們可以用來進行一些 物件初始化 操作。

//		User08.test();//呼叫此類 自動使用靜態代碼
		new User08();//建立物件時也會呼叫類
	}
}
class User08 {
	static {
		System.out.println("靜態代碼執行1");
	}static {
		System.out.println("靜態代碼執行2");
	}static void test (){
		System.out.println("靜態方法");
	}
	{ //實例區塊
		System.out.println("代碼執行1");

	}
	static {
		System.out.println("靜態代碼執行3");
	}
	{
		System.out.println("代碼執行2");

	}
}
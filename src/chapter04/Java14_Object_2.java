package chapter04;

public class Java14_Object_2{
	public static void main(String[] args) {
	byte b = 10;
	test(b);//bbb
		//方法呼叫到 char 會報錯 因為byte有負數而 char沒有 所以無法互相轉換


	}
	static void test(byte b){
		System.out.println("bbb");
	}
	static void test(short s){
		System.out.println("sss");
	}
	static void test(char c){
		System.out.println("ccc");
	}
	static void test(int i){

		System.out.println("i");
	}





}




package chapter04;

public class Java14_Object_3 {
	public static void main(String[] args) {
		//TODO 物件導向
//		AAA aaa = new AAA();
//		BBB bbb = new BBB();
		//多態約束使用場景

		AAA aaa = new BBB();
		test(aaa);//aaa
		//假如我註釋BBB的方法 依樣能生成aaa
		//因為 當這個類別沒有 他會往上找父類別
		//BBB -> AAA -> object
		BBB aaa1 = new BBB();
		test(aaa1);
	}
		static void test(AAA aaa){
			System.out.println("aaa");
		}
//		static void test(BBB bbb){
//			System.out.println("bbb");
//		}

	}
	class  AAA{

	}
	class BBB extends AAA{

	}










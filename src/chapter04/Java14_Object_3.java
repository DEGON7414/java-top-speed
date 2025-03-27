package chapter04;

public class Java14_Object_3 {
	public static void main(String[] args) {
		//TODO 物件導向 多態約束 靜態使用場景
		AAA aaa = new BBB();
		AAA.test(aaa);

		//BBB -> AAA -> object

		BBB aaa1 = new BBB();
		BBB.test(aaa1);
		//測試 1 直接測試
		//輸出 aaa bbb 「編譯看左邊，執行看右邊」在靜態中這句話不成立
		//靜態方法看左邊類型決定方法的使用範圍和使用方法
		//因為靜態在編譯期間就決定好了

		//測試 2 註解 B中的 test方法
		//一樣會有結果 因為 B是繼承A
		//當B沒有的話 會往上找父類

	}

	}
	class  AAA{
		static void test(AAA aaa){
			System.out.println("aaa");
		}
	}
	class BBB extends AAA{
//		static void test(BBB bbb){
//			System.out.println("bbb");
//		}
	}










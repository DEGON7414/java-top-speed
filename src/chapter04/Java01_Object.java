package chapter04;

public class Java01_Object {

	public static void main(String[] args) {
		// TODO 面相對象
		/*
		 所謂的面相對象就是分析問題時所涉及到的以事物為中心的分析方式
		 類和對象
		 類表示歸納和整理
		 物件就是具體事物
		 */
		// TODO class(類)
		/*
		 基本語法
		 class 類名{
		 特徵(屬性);
		 功能(方法);
		 }
		 // TODO 創建物件語法
		 // new 類名();
		  
		 */
		//範例問題 做一道菜 紅燒排骨
		// 類別 菜 物件 紅燒排骨
		
		// TODO  1.聲明類
		//TODO 	 2.創建物件
		//TODO   3.聲明屬性 屬性就是類中的變數
		//			變數類型 變數名 = 變數值
		//  		屬性類型 屬性名 = 屬性值
		//TODO   4.方法
		//			void 方法名(參數){功能代碼}
		
		
		//下面這樣賦值會給到兩個物件 因為NEW兩次
//		new Cooking().name = "紅燒排骨";
//		new Cooking().food = "排骨";
		//參考資料型態
		Cooking c = new Cooking();
		c.name = "紅燒排骨";
		c.food="排骨";
		c.execute();
	}
	}
class Cooking{
	//屬性
	String name;
	String food;
	String type = "紅燒";

	//todo 執行
	void execute(){
	System.out.println("烹飪類型:"+type);
	System.out.println("烹飪食材:"+food);
	System.out.println(name+"烹飪完成");
}
}

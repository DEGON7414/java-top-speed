package chapter04;

public class Java16_Object_Recursion {
	public static void main(String[] args) {
		//TODO 物件導向 遞歸
		//調用到方法自身的即為遞規
		//遞歸方法: 記得要有跳出邏輯 不然會爆掉
		//調用自身應該要有規律

		int i = computeAP(10);
		System.out.println(i);

		int k = computeFactorial(5);
		System.out.println(k);
		//測試1 第一個方法實測
		//9 + 7 + 5 + 3 +1 = 25
		//測試2 第二個方法
		//5 * 4 * 3 * 2 * 1
	}
	//靜態方法 類別載入時執行
	//本題是取奇數相加
	public static int computeAP(int num){
		//三元 num可以整除2嗎 可以 則-1(奇數) 不能則維持原樣
		num = num% 2 == 0? num-1: num;
		if (num == 1 ){
			return 1;
		}else{
		return num+computeAP(num-2);//調用到自身
		}
		}

	//算階層 5! = 5*4*3*2*1
		public static  int computeFactorial(int num){
			if (num <= 1){
				return 1;
			}else{
				return  num * computeFactorial(num-1);
			}
		}


}








package chapter04;

public class Java16_Object_Recursion {
	public static void main(String[] args) {
		//TODO 物件導向 遞歸
		//遞歸方法: 記得要有跳出邏輯 不然會爆掉
		//調用自身應該要有規律

		int i = computeAP(10);
		System.out.println(i);
		int k = computeFactorial(25);
		System.out.println(k);

	}
	//靜態方法 類別載入時執行
	//本題是取奇數相加
	public static int computeAP(int num){
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








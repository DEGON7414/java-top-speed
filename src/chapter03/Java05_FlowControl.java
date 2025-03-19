package chapter03;

public class Java05_FlowControl {
    public static void main(String[] args) {
       //TODO 流程控制 重複執行 循環執行
    	//根據條件重複執行
    	//主要有三種
    	//1.while
    	//while(條件表達式){循環程式}
    	//true 的話循環 false 會跳出
    	System.out.println("第一步");
    	int age = 30;
    	while(age < 40 ) {
    		System.out.println("循環程式碼");
    		age++;
    	}
    	//2.do...while
    	//do {循環
    	//}while(條件表達式)
    	//一定至少會執行一次
    	do {
			System.out.println("dowhile循環");
		} while (age < 20);
    	//3.for
    	//true 執行 false跳出
    	//初始化表達式用於對條件表達式使用到的變數進行初始化(賦值)
    	/*
    	 for (初始化表達式;條件表達式;更新表達式){
    	 循環
    	 }
    	 */
    	for(int i = 30;i<40;i++) {
    		System.out.println("FOR循環");
    	}
    	System.out.println("第二步");
    }
    }
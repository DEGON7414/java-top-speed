package chapter02;

public class Java04_Operator_3 {
    public static void main(String[] args) {
       //todo 邏輯運算符
        //描敘表達式之間的關係的運算符
        //todo 基本語法結構
        //變量 = (條件表達式1) 邏輯運算符 (條件表達式2)
        //結果為布林
        //todo & 與運算
        //兩個條件表達式都要計算結果，兩個結果為真時，才會是真
        int i = 1;
        boolean result = (i<5)&(i<20);
        System.out.println(result);
        //todo | 或運算
        //兩個條件表達式 都要計算結果，任一為真，即為真。
        //兩個都false 才會是false
        boolean result1 = (i<0)|(i> 20);
        System.out.println(result1);

        //todo && 短路與運算
        //根據第一個條件判斷是否執行第二個，第一個為真才會執行第二個，第二個也為真才會返回true
        int j = 100;
        boolean result2 = (i>0)&&(j<100);//第一個為真 才執行第二個 都為真 返回真
        System.out.println(result2);
        //todo || 短路或運算
        //根據第一個條件判斷是否執行第二個，第一個為否才會執行第二個，只要其中一個為真即為true
        boolean result3 = (i>j) || (j==100);//第一個為否 執行第二個 第二個為真 所以是真。
        System.out.println(result3);
        //todo ! 反運算
        int k = 1;
        boolean result4 = i==10;
        boolean result5 = i>0;

        System.out.println(!result4);//結果變成相反的
        System.out.println(!result5);//結果變成相反的

    }

}

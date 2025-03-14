package chapter02;

public class Java04_Operator_4 {
    public static void main(String[] args) {
       //todo 三元運算符
        //三個元素參與運算
        //語法
        //變數 = (條件表達式)? (任意表達式1):(任意表達式2)
        int i = 10;
        int j = 20;
        int k = (i == 10)?1+1:2+2;//判斷條件表達式為真或否 真的話執行第一個 否的話執行第二個
        System.out.println(k);

    }

}

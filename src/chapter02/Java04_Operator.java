package chapter02;

public class Java04_Operator {
    public static void main(String[] args) {
        //todo 運算符
        //參與運算的符號 JAVA定義的 無法自行定義
        //todo 表達式
        //採用運算符和資料連接再一起的形   成JAVA語法規則的code就是表達式
        //todo 算術運算符
        //1.一元運算:一個元素參與運算的
        //++ --
        int i = 0;
//        int j = i;//0
//        i=i+1; //1
        //++就是+簡化版本
        //i++ ++i 差別在於 ++i 是先加 i++是先使用然後再加。
        int j = ++i;
        System.out.println("j="+j);

        //2.二元運算:兩個元素參與運算的
        //運算的類型會採用兩者間最大的，並且最小為int
        System.out.println(1+2);//3
        System.out.println(2-1);//1
        System.out.println(2*2);//4
        System.out.println(4/2);//2
        System.out.println(1/2);//0 自動轉成int 沒有小數點 所以0.5去掉後面
        System.out.println(5%2);//計算餘值 1

        //可以使用()指定類型。沒指定的話會轉成int
        byte b1 = 1;
        byte b2 = 2;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);
        //先乘除後加減 括號內先算
        System.out.println(1+2*9);
        System.out.println((1+2)*9);
    }

}

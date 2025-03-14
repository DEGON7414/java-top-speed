package chapter02;

public class Java04_Operator_1 {
    public static void main(String[] args) {
       //todo 運算符 賦值運算符
        //等號其實就是賦值運算符:將等號右邊表達式的結果賦值給等號左邊的變數
        //賦值運算要考慮類型關係
        //todo 複合賦值運算符+=
        //如果元素進行運算後重新賦值給自己那可以運算和賦值的符號簡化
        //如果使用複合賦值運算符則類型不變
        int i = 1; // 簡化成 i+=1;
        byte byte1 = 1;
        byte1+=2;//此時類型不會被強制轉成int 一樣是byte
        System.out.println(byte1);


    }

}

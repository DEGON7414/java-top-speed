package chapter02;

public class Java03_Datatype_2 {
    public static void main(String[] args) {
        //todo 資料類型轉換
        String name = "X";
        int age = 18;
        name="W";
//        name = age; 會失敗 因為不同數據類型
        //byte -> short ->int -> long -> float ->double
        byte b = 10;
        short s = b;
        int i =s;
        long l = i;
        float f = l;
        double d = f;
        //JAVA可以小轉大 但大轉小無法
        //如果想要硬轉也可 使用()
        int i1 = (int)d;



    }

}

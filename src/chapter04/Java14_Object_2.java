package chapter04;

public class Java14_Object_2 {
    public static void main(String[] args) {
        //TODO 基本類型轉換
//        byte b = 10;
//        Double b = 10.0D;

//        double c = 10.0D;
//        test1(b);//bbb
//        test2(c);//sss
//        test3(b);//
//        test4(b);//i
        //測試1
        //方法呼叫到 char 會報錯 因為byte有負數而 char沒有 所以無法互相轉換
        //測試2 解開封印測試 可以大轉小嗎?
        //不能

    }

    static void test1(Double b) {
        System.out.println("bbb");
    }

    static void test2(short s) {

        System.out.println("sss");
    }

    static void test3(char c) {
        System.out.println("ccc");
    }

    static void test4(int i) {

        System.out.println("i");
    }


}




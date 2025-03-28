package chapter04;

public class Java26_Object {
    public static void main(String[] args) {
        //TODO 作用域 scope 靜態以及非靜態的呼叫範圍
        User26 user26 = new User26();
        user26.test();
        user26.test1();
        //測試 1 直接print
        //羂索會取代原先的賦值夏油傑 就近原則
        //test1 呼叫出 夏油 因為他方法中沒有定義name參數 因此print 的是屬性
        //測試 2 打開super註解 會報錯
        //因為 super 訪問的是 根據 物件→物件參考的父類。
        // 靜態不是物件因此無法找到父類。

    }
}

class Person26 {
    public static String name = "五條悟";

}

class User26 extends Person26 {
    public static String name = "夏油傑";

    public void test() {
        String name = "羂索";
        System.out.println(name); //這裡指的是參數 就近原則
        System.out.println(super.name);
        System.out.println("****** 子類test ******");

    }

    public static void test1() {
        System.out.println(name);
        System.out.println(Person26.name);
//        System.out.println(super.name);//SUPER 會報錯
//        因為 super 訪問的是 根據 物件→物件參考的父類。靜態不是物件因此無法找到父類。
//        這裡Person26.name可以用是因為他是靜態。
    }
}
package chapter04;

public class Java26_Object {
    public static void main(String[] args) {
        //TODO 作用域 scope
        User26 user26 = new User26();
        user26.test();
        user26.test1();
    }
}

class Person26 {
    public static String name = "五條悟";

}

class User26 extends Person26 {
    public static String name = "夏油傑";

    public void test() {
        String name = "宿儺";
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void test1() {
        System.out.println(name);
        System.out.println(Person26.name);
//        System.out.println(super.name);//SUPER 會報錯
//        因為 super 訪問的是 根據 物件→物件參考的父類。靜態不是物件因此無法找到父類。
//        這裡Person26.name可以用是因為他是靜態。
    }
}
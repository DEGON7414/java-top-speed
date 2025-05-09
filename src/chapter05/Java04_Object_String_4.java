package chapter05;

public class Java04_Object_String_4 {
    public static void main(String[] args) {
        //TODO String 替換
        //測試1 直接print 你替換成一護
        //2.把我 或者 是甚麼 替換成 我聽不懂拉
        //替換
        String name = "你到底在說甚麼";
        System.out.println(name.replace("你", "一護"));
        //replace ALL按照指定規則進行替換
        //或 只能用|
        System.out.println(name.replaceAll("我|甚麼", "我聽不懂拉 "));


    }

}
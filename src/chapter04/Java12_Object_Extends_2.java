package chapter04;

public class Java12_Object_Extends_2 {
    public static void main(String[] args) {
        //TODO 繼承
        //建構子
        //父類物件是在子類物件創建前創建完成，創建子類物件前，會調用父類的建構子完成對父類的建構。
        //子類構建時 JVM會自動 調用 super 以滿足父類的建構。
        //如果父類有構建方法 JVM不提供預設建構子 則 子類應該SUPER 以滿足父類建構子
        Child12 child12 = new Child12();//new 一次是產生一個物件
        child12.name = "幫你間";

    }
}

class Parent12 {
    String name;

    Parent12(String name) {
        name = name; //方法參數 賦值
        this.name = name;//這裡是會指向 物件中的name 屬性 ，子建構子會建構父的
        // 底下SUPER 賦值給此name屬性
        System.out.println("Parent2: " + name);
    }
}

class Child12 extends Parent12 {
    Child12() {
        super("差低"); // 這裡一定要super 對應父建構子
        System.out.println("Child12: " + name);
    }

}
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
        //測試1 建立物件 此時子類沒有屬性
        // 底下子類別建構子需帶父類別建構子
        // 差低 賦值到父類的name ，底下print 指向父類name

        //測試2 將子類屬性 物件開啟
        //child12會顯示為null 因為 建構子 >物件 建構時尚未賦值
        //此時子類 print 中的name 指向子類本身的name屬性(方法的就近原則)


    }
}

class Parent12 {
    String name;

    //建構子
    Parent12(String name) {
        //name = name; //方法參數 賦值
        this.name = name;//這裡是 父類中屬性name = 參數name name 參數是差低 賦值給此屬性
        System.out.println("Parent2: " + name);
    }
}

class Child12 extends Parent12 {
    String name;
    //建構子
    Child12() {
        super("差低"); // 這裡一定要super 對應父建構子
        System.out.println("Child12: " + name);
        //這裡的name
        // 如果子類沒有定義屬性 則會往上找父類 如果子類有此屬性 則此時為null 因為尚未初始化
    }

}
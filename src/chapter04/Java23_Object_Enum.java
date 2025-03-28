package chapter04;

public class Java23_Object_Enum {
    public static void main(String[] args) {
        //TODO 枚舉 Enum
        //是特殊的類 其中包含一組物件 這些物件都不會發生改變 一般使用大寫標示符
        //枚舉使用enum 關鍵字使用
        //枚舉類會將物件放在最前面 用逗號隔開
        //枚舉類不能NEW物件 是由JVM自動NEW
        // = static final
        System.out.println(City.TOKYO.name);
        System.out.println(City.TAIPEI.name);
        System.out.println(MyCity.TAI.name);
        System.out.println(MyCity.TOKYO.name);
        //測試 1 直接測試
        //enum = static final = 常數
    }
}

class MyCity {
    public String name;
    public int code;

    private MyCity(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public static final MyCity TAI = new MyCity("台", 101);
    public static final MyCity TOKYO = new MyCity("東京", 110);
}

enum City {
    TAIPEI("台北", 101), TOKYO("東京", 110);

    City(String name, int code) {
        this.code = code;
        this.name = name;
    }

    public String name;
    public int code;
}
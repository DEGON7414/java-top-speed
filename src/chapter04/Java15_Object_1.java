package chapter04;

public class Java15_Object_1 {
    public static void main(String[] args) {
        //TODO Override 多態
        //「編譯看左邊，執行看右邊」
        CCC ddd = new DDD();
        //能用什麼方法 取決變量類型 這裡是CCC 可以用sum方法
        //方法怎麼用 取決物件 也就是new DDD
        System.out.println(ddd.sum());
        //測試 1 直接運行 //40
        //執行 DDD中的sum() 方法就近原則 所以使用 DDD中的變數 i = 20

        //測試2 註解子類變數
        //此時會去找 父類的

        //測試3 註解子類全部
        // 執行中 子類沒有的 都會去找父類。
    }

}

class CCC {
    int i = 10;

    int sum() {
        return i + 10;
    }
}

class DDD extends CCC {
    int i = 20;

    @Override
    int sum() {
        return i + 20;
    }
}







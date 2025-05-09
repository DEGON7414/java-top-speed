package chapter07;

import java.util.ArrayList;

public class Java06_Collection_Generic {
    public static void main(String[] args) throws Exception {
        //TODO 泛型
        // <> 限制 進入陣列的 資料的類型 指定要object
        ArrayList<Object> objects = new ArrayList<>();
        //TODO 泛型類型區別
        //類型 約束 物件的使用場景(方法)
        //讓方法、類別可以接受不同類型的物件 並在執行時決定具體的類型
        //泛型有時稱為類型參數
        //命名用大寫

        //測試1 定義一個帶泛型的類別
        //其中不固定他的類型
        //由後面在給其值與類型
        MyBox<String> box1 = new MyBox<>("Hello World");
        System.out.println(box1.getData());//GET STRING
        MyBox<Integer> box2 = new MyBox<>(123);
        System.out.println(box2.getData());//GET INTEGER

    }
}
//泛型類別
class MyBox<C>{
    //之後的資料類型 可以再做決定 例如 C可以是 字串 或 INT
    public C data;

    public MyBox(C data) {
        this.data = data;
    }

    public C getData() {
        return data;
    }
}
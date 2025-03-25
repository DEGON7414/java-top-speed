package chapter07;

import java.util.ArrayList;

public class Java06_Collection_ {
    public static void main(String[] args) throws Exception {
        //TODO 泛型
        ArrayList<Object> objects = new ArrayList<>();
        // <> 限制 進入陣列的 資料的類型 指定要object
        //TODO 泛型類型區別
        //類型 約束 物件的使用場景(方法)
        //泛型有時稱為類型參數
        //命名用大寫
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
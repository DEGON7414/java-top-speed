package chapter07;

import java.util.ArrayList;

public class Java03_Collection_List {
    public static void main(String[] args) throws Exception {
        //TODO Collection 集合 List
        //ArrayList = array + list
        //TODO List:列表 清單
        //按照資料插入順序進行儲存
        //TODO array 陣列

        //TODO 創建第一個ArrayList
        ArrayList arrayList = new ArrayList();
        //1.不需要設定長度 直接new 底層是空的陣列
        //2.構造參數可以傳入一個 INT類型的值 用來設定長度
        //3.構建參數需要傳入一個Collection 集合類型的值，用於將其他集合中的資料放置當前集合中

        //TODO 增加資料
        //add 方法 可增加資料，只要將資料 作為參數 傳遞到add方法即可
        //添加資料時 如果集合中沒有任何資料，則底層預設長度10的陣列
        arrayList.add("a");
        arrayList.add("a"); //可以重複
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        //TODO 訪問集合中的資料
        //1.獲取集合中的資料的條數 .size()
        System.out.println(arrayList.size());
        //2.打印集合對象
        System.out.println(arrayList);
        //3.獲取指定位置的資料
        System.out.println(arrayList.get(0));
        //4.遍歷
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //4.如果遍歷不在乎資料位置可以使用特殊for
        //for (循環物件:集合)
        for(Object o : arrayList) {
            System.out.println("特殊for: "+o);
        }
        //TODO修改資料
        //將指定位置的資料進行修改，.set 方法需要傳兩個參數，第一個參數表示資料位置，第二個表示修改的值
        //方法會返回結果 是 更新前的值
        //
        Object e = arrayList.set(2, "e");
        System.out.println("修改前"+ e);
        System.out.println("修改後:"+arrayList);
        //TODO 刪除資料
        // .remove 刪除指定位置
        //返回刪除的值
        Object remove = arrayList.remove(2);
        System.out.println("刪除了"+ remove);
        System.out.println(arrayList);

    }
}
package chapter07;

import java.util.ArrayList;
import java.util.HashSet;

public class Java08_Collection_Hashset_1 {
    public static void main(String[] args) throws Exception {
        //TODO 哈希排序 Hashset
        //Hashset = hash + set
        //hash = 哈希算法
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add("燎原火");
        arrayList.add("司馬懿");
        arrayList.add("小孟");

        //TODO 增加 (無序)
        //1.把剛才陣列加進去
        hashSet.addAll(arrayList);
        System.out.println(hashSet);
        //2.轉換成陣列 至少可以遍歷取得索引
        Object[] array = hashSet.toArray();
        //3.檢查是否為空
        System.out.println(hashSet.isEmpty());
        //4.是否含有
        hashSet.contains("小孟");
        //5.集合長度
        System.out.println(hashSet.size());
        //6.清空[]
//        hashSet.clear();
        //7.複製
        Object clone = hashSet.clone();
        System.out.println(clone);
        //我們甚麼時候會用到把list倒到SET
        //判斷有無重複的時候 只保留重複的一筆

    }

}
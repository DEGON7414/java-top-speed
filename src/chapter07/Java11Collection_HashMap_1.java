package chapter07;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Java11Collection_HashMap_1 {
    public static void main(String[] args) throws InterruptedException {
        //TODO 集合 Hashmap
        // 書接上回 介紹常用方法  putIfAbsent replace keySet clear containsKey
        HashMap hashMap = new HashMap();
        //put 可以新增 也可以修改
        hashMap.put("A", 1); //第一個是 key 第二個是 value
        hashMap.put("A", 4);
        //putIfAbsent 如果沒這個key 就新增 有的話就不動
        hashMap.putIfAbsent("A", 1);
        hashMap.putIfAbsent("B", 2);
        System.out.println(hashMap);
        //替換key 的 value
        hashMap.replace("A", 100);
        //不會報錯但也不會新增
        hashMap.replace("D", 200);
        System.out.println(hashMap);
        //清空
//        hashMap.clear();
        //獲取集合中所有key
        Set set = hashMap.keySet();
        for (Object o : set) {
            System.out.println(o);
        }
        //是否含有
        hashMap.containsKey("A");

        Collection values = hashMap.values();
        for (Object o : values) {
            System.out.println(o );

        }
    }
}
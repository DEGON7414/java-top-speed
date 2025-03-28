package chapter07;

import java.util.HashMap;

public class Java11Collection_HashMap {
    public static void main(String[] args) throws InterruptedException {
        //TODO 集合 Hashmap
        //存儲是無序的
        HashMap hashMap = new HashMap();
        //put 可以新增 也可以修改
        hashMap.put("A", 1); //第一個是 key 第二個是 value
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put("A", 4);
        //查詢
        System.out.println(hashMap.get("A"));
        System.out.println(hashMap);
        //刪除
        hashMap.remove("B");
        System.out.println(hashMap);

    }
}
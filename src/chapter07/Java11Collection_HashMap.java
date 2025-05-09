package chapter07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Java11Collection_HashMap {
    public static void main(String[] args) throws InterruptedException {
        //TODO 集合 Hashmap
        //TODO 底層 key是用HASHSET實作
        //treemap treeset 底層 查 可排序
        //存儲是無序的
        HashMap hashMap = new HashMap();
        //1.put 可以新增 也可以修改
        hashMap.put("A", 1); //第一個是 key 第二個是 value
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put("A", 4);
        //2.查詢
        System.out.println(hashMap.get("A"));
        System.out.println(hashMap);
        //3.刪除
        hashMap.remove("B");
        //4.這個需要KV都一樣才會刪除
        hashMap.remove("B", 1111);
        System.out.println(hashMap);
        //5.替換 replace 純替換 如果沒有key 就不會操作
        hashMap.replace("A", 5);
        System.out.println(hashMap);
        System.out.println("**********");

        //6.keyset獲取map 中所有的key
        Set keySet = hashMap.keySet();
        for (Object object : keySet) {
			System.out.println(object);
		}
      //7.獲取鍵值對
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

		}
        
        

    }
    
    	

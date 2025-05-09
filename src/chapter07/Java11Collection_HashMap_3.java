package chapter07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Java11Collection_HashMap_3 {
    public static void main(String[] args) throws InterruptedException {
        //TODO 集合 迭代器 iterator
    	HashMap hashMap = new HashMap();
    	hashMap.put("A", 1);
    	hashMap.put("B", 2);
    	hashMap.put("C", 3);
    	Set keys = hashMap.keySet();
    	//iterator
    	Iterator iterator = keys.iterator();
    	//進行遍歷時修改數據要用iterator
    	//如果直接遍歷會出錯ConcurrentModificationException
    	//因為修改資料了導致循環中的排序和修改後的排序不依樣
    	//iterator會記得狀態並安全刪除
		//測驗1 直接執行
    	
    	
    	//hasNext 是否有下一條數據
    	while(iterator.hasNext()) {
    		//獲取下一條數據
    		String key =(String) iterator.next();
    		if ("B".equals(key)) {
    			//remove 只能對當前資料做操作
    			iterator.remove();
			}
    		System.out.println(hashMap.get(key));
    	}
}
}
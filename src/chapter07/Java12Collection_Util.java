package chapter07;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Java12Collection_Util {
    public static void main(String[] args) throws InterruptedException {
       //TODO 集合常用工具類
    	int[] is = {3,5,2,1,4};
    	int[] is1 = {1,2,3,4,5};
    	int[] is2 = {1,2,3,4,5,6};
    	//tostring 
    	System.out.println(Arrays.toString(is));
    	//記憶體地址
    	System.out.println(is);
    	//list 有序 可重複
    	List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

    	// 排序(升序)
    	Arrays.sort(is); // 1,2,3,4,5
    	System.out.println(Arrays.toString(is));

    	// 二分查找法: 排序後的陣列
    	//傳回該值的索引 沒找到會回傳false
    	//索引 從0開始算
    	System.out.println(Arrays.binarySearch(is, 5));

    	// 陣列的比较
    	System.out.println(Arrays.equals(is2, is1));
}
}
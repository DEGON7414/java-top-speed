package chapter07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Java07_Collection_Sort {
    public static void main(String[] args) throws Exception {
        //TODO 排序
        //Comparator 自定義排序
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        //Collections 集合工具類中有sort方法實現自然排序
        Collections.sort(arrayList);
        System.out.println(arrayList);
        //排序需要一個實現比較器接口的物件
        arrayList.sort(new NumberComparator());
        //測試1 直接print 測試規則1 升序
        //測試2 測試規則2 降序
        System.out.println(arrayList);
    }
}

class NumberComparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        //如果第一個數比第二個大 返回正數 表示升序
//        return o1 - o2;
        //如果第二個比比第一個大 返回負數 表示降序
        return o2 - o1;
        //如果第一個 = 第二個 則 為0
//        return 0;
    }

}
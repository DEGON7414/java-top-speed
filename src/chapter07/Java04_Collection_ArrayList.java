package chapter07;

import java.util.ArrayList;

public class Java04_Collection_ArrayList {
    public static void main(String[] args) throws Exception {
        //TODO 集合 Arraylist
        //Arrayt 常用方法
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        ArrayList otherList1 = new ArrayList();
        otherList1.add("a");
        otherList1.add("b");
        otherList1.add("c");
        arrayList.addAll(otherList1);
        System.out.println(arrayList);

        //.size 是集合資料的長度
        System.out.println(arrayList.size());
        //isEmpty() 判斷是否為空
        System.out.println(arrayList.isEmpty());
        //.clear 清空集合所有資料
//        arrayList.clear();
        //.remoeAll 清空指定集合
        arrayList.removeAll(otherList1);
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        //判斷是否有某調資料 contain
        //返回 布林
        System.out.println(arrayList.contains(1));
        //獲取資料(第一個)在索引的位置 如果資料不存在返回 -1
        System.out.println(arrayList.indexOf(1));
        System.out.println(arrayList.indexOf("a"));
        //獲取資料(最後一個)在索引的位置 如果資料不存在返回 -1
        System.out.println(arrayList.lastIndexOf(1));
        //轉成普通陣列
        Object[] array = arrayList.toArray();
        Object clone = arrayList.clone();
        //clone 是 物件類型 把他強制轉換成ArrayList
        ArrayList arrayList1rray = (ArrayList)clone;

    }
}
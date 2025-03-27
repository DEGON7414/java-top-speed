package chapter07;

import java.util.HashSet;

public class Java08_Collection_Hashset {
    public static void main(String[] args) throws Exception {
        //TODO 哈希排序 Hashset
        //Hashset = hash + set
        //hash = 哈希算法
        HashSet hashSet = new HashSet();
        //TODO 增加 (無序)
        hashSet.add("阿良川麥可");
        hashSet.add("阿良川朱音");
        hashSet.add("阿良川朱音");//重複不存
        hashSet.add("阿良川一生");
        hashSet.add("阿良川志雄");

        //TODO 修改
        //透過哈希算法 無法保證修改值的索引可以準確的 = 被修改的值
        //所以要修改只能刪除後 新增
        //TODO 刪除
//        hashSet.remove("阿良川一生");
//        hashSet.clear();
        System.out.println(hashSet);
        //TODO 查詢
        for (Object s:hashSet){
            System.out.println(s);
        }

    }

}
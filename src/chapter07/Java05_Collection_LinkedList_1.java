package chapter07;

import java.util.LinkedList;

public class Java05_Collection_LinkedList_1 {
    public static void main(String[] args) throws Exception {
        //TODO 集合 LinkedList
        //構建
        LinkedList linkedList = new LinkedList();
        //增加 add
        linkedList.add("a");
        //增加到頭 尾 索引

        //查看size
        System.out.println(linkedList.size());
        //清空
        linkedList.clear();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("e");
        linkedList.add("f");
        linkedList.add("g");

        //刪除
        linkedList.remove(); //空參數預設抓第一個
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove(1);//根據索引
        linkedList.remove("a");
        //是否為空
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList);
        //獲取第一個
        System.out.println(linkedList.element());
        //含有
        linkedList.contains("a");
        linkedList.indexOf("");
        linkedList.lastIndexOf("");

        //配合堆疊而定義的
        //添增 push 加在開頭 add加在結尾
        linkedList.push("aaaa");
        //從陣列中彈出 第一個元素 並返回
        System.out.println(linkedList.pop());

    }
}
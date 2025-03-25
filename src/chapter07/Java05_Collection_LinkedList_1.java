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
        linkedList.addFirst("b");
        linkedList.addLast("c");
        linkedList.add(1,"d");
        //查看size
        System.out.println(linkedList.size());
        //清空
        linkedList.clear();
        //刪除
        linkedList.remove(); //空參數預設抓第一個
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove(1);//根據索引
        linkedList.remove("a");
        //是否為空
        System.out.println(linkedList.isEmpty());
        //獲取第一個
        linkedList.element();
        //含有
        linkedList.contains("a");
        linkedList.indexOf("");
        linkedList.lastIndexOf("");
        //添增 push 用在stack
        linkedList.push("aaaa");
        //彈出
        System.out.println(linkedList.pop());

    }
}
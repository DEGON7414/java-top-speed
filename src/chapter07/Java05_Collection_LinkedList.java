package chapter07;

import java.util.LinkedList;

public class Java05_Collection_LinkedList {
    public static void main(String[] args) throws Exception {
        //TODO 集合 LinkedList
        //linked(連結) + list
        //構建
        LinkedList linkedList = new LinkedList();
        //增加 add
        linkedList.add("a");
        //增加到頭 尾 索引
        linkedList.addFirst("b");
        linkedList.addLast("c");
        linkedList.add(1,"d");

        //獲取 getfirst getlast
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        //獲取 遍歷
        linkedList.get(1);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("全部"+ linkedList.get(i));
        }
        System.out.println("**************");

        for(Object object:linkedList){
            System.out.print(object);
        }
        System.out.println(" ");
        System.out.println("**************");
        //修改set
        linkedList.set(1,"e");
        //刪除 remove
        linkedList.remove(2);
        System.out.println(linkedList);

    }
}
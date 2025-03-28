package chapter07;

import java.util.concurrent.ArrayBlockingQueue;

public class Java10_Collection_Queue {
    public static void main(String[] args) throws InterruptedException {
        //TODO 集合 Queue 隊列
        //array + queue
        ArrayBlockingQueue arrayQueue = new ArrayBlockingQueue(3);
        arrayQueue.add("舒潔");
        arrayQueue.add("拉拉");
        arrayQueue.add("靠得住");
        //超過指定數量 報錯
//        arrayQueue.add("靠得住");
        //阻塞 等待空閒再塞 此時方法一直運行中
//        arrayQueue.put("123");
        //不會阻塞 空間滿了回傳false
        boolean String123 = arrayQueue.offer("123");
        System.out.println(arrayQueue);
        //poll 移除頭部元素 不會拋異常 空的話丟null
        System.out.println(arrayQueue.poll());
        System.out.println(arrayQueue.take());
        System.out.println(arrayQueue.take());
        //取不到東西 一樣會阻塞
//        System.out.println(arrayQueue.take());

    }
}
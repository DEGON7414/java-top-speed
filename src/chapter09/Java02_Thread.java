package chapter09;

/**
 * ClassName: Java01_Thread
 * Description:
 *
 * @Author 許記源
 * @Create 2025/4/1 下午 03:53
 * @Version 1.0
 */
public class Java02_Thread {
    public static void main(String[] args) throws InterruptedException {
        //TODO 線程 (串行 並發)
        //串行 多個線程連接成串 按順序執行
        //並發執行 多個線程是獨立的 誰搶到CPU執行權 誰就先
        //TODO 創建線程
        MyThread1 thread = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        //TODO 線程 啟動!
        thread.start();
        thread2.start();
        //線程連接成串
        thread.join();
        thread2.join();
    }
}
//TODO 第一個線程
class MyThread1 extends Thread {

    public void run() {
        System.out.println("新線程1"+Thread.currentThread().getName());
    }

}
//TODO 第二個線程
class MyThread2 extends Thread {

    public void run() {
        System.out.println("新線程2"+Thread.currentThread().getName());
    }

}

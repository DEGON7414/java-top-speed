package chapter09;

/**
 * ClassName: Java01_Thread
 * Description:
 *
 * @Author 許記源
 * @Create 2025/4/1 下午 03:53
 * @Version 1.0
 */
public class Java03_Thread {
    public static void main(String[] args) throws InterruptedException {
        //TODO 線程 休眠
        //測試1
        //每次都會創建新的線程 start 後馬上休眠 1000毫秒 = 1秒
        while (true){
        MyThread01 thread = new MyThread01();
        thread.start();
        thread.sleep(1000);
        }

    }
}
//TODO 第一個線程
class MyThread01 extends Thread {

    public void run() {
        System.out.println("新線程1"+Thread.currentThread().getName());
    }

}

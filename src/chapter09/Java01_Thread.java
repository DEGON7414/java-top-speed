package chapter09;

/**
 * ClassName: Java01_Thread
 * Description:
 *
 * @Author 許記源
 * @Create 2025/4/1 下午 03:53
 * @Version 1.0
 */
public class Java01_Thread {
    public static void main(String[] args) {
        //TODO thread線程
        //測試1直接執行
        //main 方法運行在main線程中
        //main 會先出來 因為他是程式入口

        //currebtThread方法 用於獲得當前運行的線程
        //getName 取得名字
        System.out.println(Thread.currentThread().getName());//main
        //TODO 創建線程
        MyThread thread = new MyThread();
        //TODO 線程 啟動!
        thread.start();
    }
}
class MyThread extends Thread {

    public void run() {
        System.out.println("新線程"+Thread.currentThread().getName());
    }

}
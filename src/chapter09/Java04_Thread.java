package chapter09;

/**
 * ClassName: Java01_Thread
 * Description:
 *
 * @Author 許記源
 * @Create 2025/4/1 下午 03:53
 * @Version 1.0
 */
public class Java04_Thread {
    public static void main(String[] args) throws InterruptedException {
        //TODO 線程 運行
        //測試1
        //線程中 一樣有建構子 也可以定義屬性
        //測試2
        //底下的TODO部分
        MyThread5 myThread5 = new MyThread5("虎杖悠仁");
        MyThread5 myThread55 = new MyThread5("伏黑惠");
        myThread5.start();
        myThread55.start();
        //TODO 構建線程物件時 可以只把邏輯傳過去 這裡是簡化 下面版本的(Lambda 表達式)
        //TODO 使用 Lambda 表達式的基本結構：() -> {邏輯}
        Thread thread = new Thread(()->{
            System.out.println("釘哥");
        });
        thread.start();
        //TODO 建構線程物件 可以傳遞 實現 runnable接口類的物件 使用匿名類
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("牛頭人");
            }
        });
        thread1.start();
    }
}
//TODO 自定義線程
//繼承Thread
//重寫run方法

class MyThread5 extends Thread {
    private String name;
    public MyThread5(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("新線程1"+Thread.currentThread().getName());
    }

}


package chapter09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Java05_Thread_Pool {
    public static void main(String[] args) throws InterruptedException {
        //TODO 線程池
        //所謂線程池 就是線程物件的容器
        //可以根據需要 於啟動時 創建一個或多個線程物件
        //JAVA有4種常見的線程池
        //1.創建固定數量的線程物件

        //ExecutorService 是線程服務對象
        //創建一個線程池 內有三個線程的空間
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
        //完成後記得要關閉
        executorService.shutdown();
        //2.根據需求動態創建線程newCachedThreadPool
        //()內不要填就好
//        ExecutorService executorService1 = Executors.newCachedThreadPool()ThreadPool();
        //3.單一線程
//        ExecutorService executorService2 = Executors.newSingleThreadExecutor();


    }
}



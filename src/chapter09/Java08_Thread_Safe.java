package chapter09;

public class Java08_Thread_Safe {
    public static void main(String[] args) throws InterruptedException {
        //TODO 線程安全
        //並發執行時 修改了共享內存中物件的屬性 導致資料衝突
        //測試 1 直接執行 兩個值都是DIO
        //因為他們是並發執行 誰先搶到就先執行
        //先執行 > 賦值> 睡覺>
        //後執行 > 賦值> 睡覺>
        //因此最後打印的會是後執行的 因為他們都打印同一個物件。
        User08 user08 = new User08();

        Thread thread1 = new Thread(() -> {
            user08.name = "JOTARO";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user08.name);
        });
        Thread thread2 = new Thread(() -> {
            user08.name = "DIO";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user08.name);
        });
        thread1.start();
        thread2.start();

    }
}
class User08{
    String name;
}



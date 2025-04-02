package chapter09;

public class Java06_Thread_Syn {
    public static void main(String[] args) throws InterruptedException {
        //TODO 同步
        //關鍵字是 synchronized 可以修飾代碼塊
        //多個線程訪問同步方法時 只能一個一個訪問 同步效率
        /*
        synchronized (用於同步對象){
                處理邏輯
        }
          */
        Num num = new Num();
        User user = new User(num);
        user.start();
        Bank bank = new Bank(num);
        bank.start();
        //1.User 線程執行 wait
        //2.bank 線程執行 sleep 醒來 
        //3.notify 通知user

    }


}
class Num{

}
class Bank extends Thread{
    private Num num;
    public Bank(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (num){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("開門");
            num.notifyAll();
        }
    }
}
class User extends Thread{
    private Num num;
    public User(Num num) {
        this.num = num;
    }
    @Override
    public void run() {
        //同步
        synchronized (num){
            System.out.println("我是號碼1 銀行還沒開門 等");
            try {
                //等待 當前線程釋放鎖(num)直到被通知
                num.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("叫到我了");
        }

    }
}


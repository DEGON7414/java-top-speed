package chapter04;

public class Java21_Object {
    public static void main(String[] args) {
        //TODO 抽象類 不完整的類 因為抽象方法 是不完整的方法所以他不能建立物件
        //不能建構物件
        //關鍵字 abstract
        //abstract 返回值類型 方法名 (參數) 注意沒有{ 執行邏輯 }
        //不能用final、private、static 修飾 因為抽象類注定要改寫的
        //類有抽象方法 肯定是抽象類
		//但是抽象類有實體法 是可以的

        //測試1 打開底下new註解
		//失敗不能建構物件。
		//測試 2 測試User21.eat
        //無法直接建構物件
		//但可以多通過子類間接創建物件

//		User21 user21 = new User21();User21

        User21 user21 = new UserEat();
        user21.eat();
    }

}

abstract class User21 {
    public abstract void eat();
}

class UserEat extends User21 {
    @Override
    public void eat() {
        System.out.println("1");
    }
}

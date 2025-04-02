package chapter05;


/**
 * ClassName: Java01_Object
 * Description:
 *
 * @Author 許記源
 * @Create 2025/3/19 下午 03:02
 * @Version 1.0
 */
public class Java02_Object {
    public static void main(String[] args) {
        ///TODO 陣列
        //測試1 new String 陣列 print 索引第一個
        //測試2 測試特殊迴圈
        //測試3 測試.lenth

        //聲明方式 類型[] 變數
        //陣列的創建 new 類型 [容量]
        String[] names = new String[3];
        names[0] = "五條";
        names[0] = "2.5條";
        names[1]= "七海";
        names[2]="夏油";
        System.out.println(names[0]);

        //特殊for 用法
        //for(屬性 取出的值放入變數 : 陣列或集合)
            System.out.println("特殊for開始");
        for (String name : names) {
            System.out.println(name);
        }
            System.out.println("特殊for結束");
        //建立 User01 類 陣列 初始化 [nulll,nulll,nulll,nulll]
        User01[] user1s = new User01[4];
        //賦上物件 .lengh 取得 陣列長度 (個數)。陣列中 legngh 是 屬性!!不是方法
        for (int i = 0; i < user1s.length; i++) {
            user1s [i] = new User01();
            user1s [i].test();
        }
    }
}
class User01{
        void test(){
            System.out.println("test");
            System.out.println("******");
        }
}
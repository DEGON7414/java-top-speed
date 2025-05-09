package chapter05;

public class Java09_Object {
    public static void main(String[] args) throws Exception {
        //TODO 比較
        //參考用equals(內容) 比較好 基本型別用 ==比較好。
        //Objects 工具類 提供靜態方法方便操作 常用有equals toString等等
        //測試1.比較基本資料型別
        //基本資料型別 雙等號比較 == 數值
        //比較會自動轉換成較大的類型 最小為int 同算數
        byte b = 10;
        int i = 10;
        int j = 20;
        System.out.println(i == j);
        System.out.println(b == i);
        double d = 10.0;
        System.out.println(i == d);
        System.out.println("******以上基本資料型別***********");
		//測試2
        //參考資料型態 == 比較的是記憶體地址
        String s = "abc"; // 字符串常量池
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s.equals(s2));//equal 比較內容
        System.out.println("*******以上參考資料型態**********");

		//測試3比較物件
        //沒特別重寫的話用的是 objecct類的equal 預設是比記憶體位置
        //底下有override
        User9 user1 = new User9();
        User9 user2 = new User9();
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
        System.out.println("*******以上物件**********");
		//測試4
        //包裝類型
        //int => Inteager => JVM為了方便簡化操作
        //Inteager 緩存空間為 byte -127~127。 這範圍的是 JAVA 先建立好的
        //Integer i1 =Integer.valueOf(100);
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1 == i2);
        Integer i3 = 1000;
        Integer i4 = 1000;
        //超過緩存的每次都會建立新物件 故記憶體位置不同
        System.out.println(i3 == i4);//false
        System.out.println("*******以上包裝類型**********");


    }
}

class User9 {
    String name;
    //HASHCODE 可以當作JAVA每個物件中的ID
    //對應到資料庫主鍵值
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

}
package chapter07;

import java.util.HashSet;

public class Java09_Collection_Hashset_2 {
    public static void main(String[] args) throws Exception {
        HashSet hashSet = new HashSet();
        User09 user1 = new User09();
        user1.id = 1;
        user1.name= "多田野";
        hashSet.add(user1);
        System.out.println(user1.hashCode());

        User09 user2 = new User09();
        user2.id = 1;
        user2.name = "多田野";
        hashSet.add(user2);
        System.out.println(user2.hashCode());
        System.out.println(hashSet);
        //測試 1
        //可以發現 即便都是賦一樣值 在hash眼中 只要是不同物件 就是 不同東西不會比照辦理
        //測試 2 打開底下三個 override方法
        //hashset中本身 底層會使用到 equal方法比較 兩者記憶體位置
        //這裡重寫 改成判斷 id&name
        //判斷一樣 則不允許加入 故這裡結果只會剩一個

    }
}
class User09{
    public int id;
    public String name;

//    @Override //比較兩個物件是否相等
//    public boolean equals(Object o) {
//        //檢查物件是否為 null 或 類型是否不同
//        if (o == null || getClass() != o.getClass()) return false;
//        //強轉成 User09
//        User09 user09 = (User09) o;
//        //比較 id name
//        return id == user09.id && Objects.equals(name, user09.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//    @Override
//    public String toString() {
//        return "User09{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
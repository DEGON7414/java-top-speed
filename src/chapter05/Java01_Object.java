package chapter05;

/**
 * ClassName: Java01_Object
 * Description:
 *
 * @Author 許記源
 * @Create 2025/3/19 下午 03:02
 * @Version 1.0
 */
public class Java01_Object {
    public static void main(String[] args) {
        //TODO 常見類和物件
        //java.lang.Object:物件
        //物件轉成字符
        //Object 的toString 預設傳的是 記憶體地址
        //除非有override

        //測試 1
        //取得記憶體地址
        //hashcode
        Object objperson = new Person();
        String s = objperson.toString();
        System.out.println(s);

        //TODO 獲取 物件的hashcode
        int i = objperson.hashCode();
        System.out.println(i);

    }
}
class Person {
    public String name = "利卡拉拉";

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}
class User extends Person {

}
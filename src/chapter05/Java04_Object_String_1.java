package chapter05;

public class Java04_Object_String_1 {
    public static void main(String[] args) {
    //TODO String 拼接
        //字符串前後 + 的 類型都會轉換成 string
        //string 存在 string constant pool 優化 所以一樣的字符會指向同一個地址。
        String s = "a"+ "b";
        String s2 = "ab";
        String s3 = "abc"+1+2;// abc12
        String s4 = 1+"abc"+2;//1abc2
        String s5 = 1+2+"abc";//3abc
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s+","+s2+","+s3+","+s4+","+s5);
    }

}